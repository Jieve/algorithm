package com.jieve.algorithm.sort.implement;

import java.util.List;

import com.jieve.algorithm.interfaces.Sort;

/**
* @ClassName: BinaryInsertionSort
* @Description: 二分插入排序算法实现
* @author yyy
* @date 2017年11月21日 下午6:05:42
* 
*/
public class BinaryInsertionSort extends BaseSort implements Sort {

	public BinaryInsertionSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {
		if (null == originalList || originalList.size() <= 1) {
			return;
		}
		for (int i = 1; i < originalList.size(); i++) {

			int left = 0;
			int right = i - 1;
			int median = 0;
			while (left <= right) {
				median = (left + right) / 2;
				if (originalList.get(i) > originalList.get(median)) {
					left = median + 1;
					median++;
				} else if (originalList.get(i) < originalList.get(median)) {
					right = median - 1;
				} else {
					while (originalList.get(i) == originalList.get(median)) {
						median++;
					}
					break;
				}
			}
			Integer temp = originalList.get(i);
			for (int f = i - 1; f >= median; f--) {
				originalList.set(f + 1, originalList.get(f));
			}
			originalList.set(left, temp);
		}
	}

}
