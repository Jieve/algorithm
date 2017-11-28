package com.jieve.algorithm.sort.implement;

import java.util.List;

import com.jieve.algorithm.sort.interfaces.Sort;

/**
 * @ClassName: BubbleSort
 * @Description: 冒泡排序算法实现
 * @author yyy
 * @date 2017年11月22日 下午3:03:22
 * 
 */
public class BubbleSort extends BaseSort implements Sort {

	public BubbleSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {
		if (null == originalList || originalList.size() <= 1) {
			return;
		}
		int temp;
		for (int i = originalList.size(); i > 1; i--) {

			for (int j = 0; j < i - 1; j++) {
				if (originalList.get(j) > originalList.get(j + 1)) {
					temp = originalList.get(j);
					originalList.set(j, originalList.get(j + 1));
					originalList.set(j + 1, temp);
				}
			}
		}
	}
}
