package implement;

import java.util.List;

import interfaces.Sort;

/**
* @ClassName: BinaryInsertionSort
* @Description: 二分插入排序实现
* @author yyy
* @date 2017年11月16日 下午11:08:22
* 
*/
public class BinaryInsertionSort extends BaseSort implements Sort {

	public BinaryInsertionSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {
		if (null == originalList || originalList.isEmpty()) {
			return;
		}
		for (int i = 1; i < originalList.size(); i++) {

			int j = 0;
			int k = i - 1;
			while (j != k) {
				if (originalList.get(i) < originalList.get((j + k) / 2)) {
					j = (j + k) / 2;
				} else if (originalList.get(i) > originalList.get((j + k) / 2)) {
					k = (j + k) / 2;
				}
			}
			for (int f = i - 1; f >= j; f--) {
				originalList.set(k + 1, originalList.get(k));
			}

		}
	}

}
