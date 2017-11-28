package com.jieve.algorithm.sort.implement;

import java.util.List;

import com.jieve.algorithm.sort.interfaces.Sort;


/**
* @ClassName: MergeSort
* @Description: 归并排序算法实现
* @author yyy
* @date 2017年11月24日 下午5:06:04
* 
*/
public class MergeSort extends BaseSort implements Sort {

	public MergeSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {
		if (null == originalList || originalList.size() <= 1) {
			return;
		}
		//初始步长
		int gap = 1;
		int length;
		int a_low;
		int a_high;
		int b_low;
		int b_high;
		//临时数组
		int[] temp;
//		int count =0;
		while (originalList.size() > gap) {
			
			length = originalList.size()%(2*gap)==0?originalList.size()/(2*gap):originalList.size()/(2*gap) + 1;
			for (int i = 0; i < length; i++) {
				if (i==length-1) {
					a_low = 2*i*gap;
					if (originalList.size()>=(2*i+1)*gap) {
						a_high = (2*i+1)*gap -1;
						b_low = (2*i+1)*gap;
						b_high = originalList.size()-1;
					} else {
						a_high = originalList.size()-1;
						b_low = 0;
						b_high = -1;
					}
				}else {
					a_low = 2*i*gap;
					a_high = (2*i+1)*gap -1;
					b_low = (2*i+1)*gap;
					b_high = 2*(i+1)*gap-1;
				}
//				System.out.println("a_low:" + a_low + ", a_high:" + a_high + ", b_low:" + b_low + ", b_high:" + b_high);
				if (b_low==0&&b_high==-1) {
					temp = new int[a_high-a_low+1];
				}else {
					temp = new int[b_high-a_low + 1];
				}
				int j,k,index;
				for (j = 0,k = 0,index=0; j < a_high-a_low+1&&k<b_high-b_low+1; index++) {
					if (originalList.get(a_low + j)<=originalList.get(b_low+k)) {
						temp[index] = originalList.get(a_low + j);
						j++;
					}else {
						temp[index] = originalList.get(b_low+k);
						k++;
					}
					
				}
				if (j<a_high-a_low+1) {
					for (int l = j; l < a_high-a_low+ 1; l++,index++) {
						temp[index] = originalList.get(a_low + l);
					}
				} else if (k<b_high-b_low+1) {
					for (int l = k; l < b_high-b_low+ 1; l++,index++) {
						temp[index] = originalList.get(b_low + l);
					}
				}
				for (int m = a_low,n=0; m <= b_high; m++,n++) {
					originalList.set(m, temp[n]);
				}
			}
	
			gap *= 2;
//			System.out.println("第"+ ++count + "次处理结果：" + originalList);
		}

	}

}
