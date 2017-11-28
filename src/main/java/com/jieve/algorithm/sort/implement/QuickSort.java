package com.jieve.algorithm.sort.implement;

import java.util.List;

import com.jieve.algorithm.sort.interfaces.Sort;

/**
* @ClassName: QuickSort
* @Description: 快速排序算法实现
* @author yyy
* @date 2017年11月23日 下午6:18:50
* 
*/
public class QuickSort extends BaseSort implements Sort {

	public QuickSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {

		if (null == originalList || originalList.size() <= 1) {
			return;
		}
		quickSort(0, originalList.size() - 1);

	}
	
	/**
	* @Title: quickSort
	* @Description: 以基准元素为中心左右递归排序
	* @param @param left
	* @param @param right
	* @return void
	* @throws
	*/
	public void quickSort(int left, int right) {
		int left_start = left;
		int right_start = right;
		int reference;
		if (left <= right) {
			// 取左侧第一个待排序元素为基准元素
			reference = originalList.get(left);
			while (left != right) {
				while (left < right && originalList.get(right) >= reference) {
					right--;
				}
				originalList.set(left, originalList.get(right));
				while (left < right && originalList.get(left) < reference) {
					left++;
				}
				originalList.set(right, originalList.get(left));
			}
			originalList.set(right, reference);
			quickSort(left_start, left - 1);
			quickSort(right + 1, right_start);
		}
	}
	
	//算法改进思路：
	// 只对长度大于k的子序列递归调用快速排序,让原序列基本有序，然后再对整个基本有序序列用插入排序算法排序。
	//实践证明，改进后的算法时间复杂度有所降低，且当k取值为 8 左右时,改进算法的性能最佳。

}
