package implement;

import java.util.List;

import interfaces.Sort;

/**
* @ClassName: BinaryBubbleSort
* @Description: 改进的冒泡排序算法(折半)实现，;）不明白的是折半了以后耗时反而长了
* @author yyy
* @date 2017年11月23日 上午11:58:34
* 
*/
public class BinaryBubbleSort extends BaseSort implements Sort {

	public BinaryBubbleSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {
		if (null == originalList || originalList.size() <= 1) {
			return;
		}
		int temp;
		for (int i = 0; i <= originalList.size() / 2; i++) {
			for (int j = i; j < originalList.size() - i - 1; j++) {
				if (originalList.get(j) > originalList.get(j + 1)) {
					temp = originalList.get(j);
					originalList.set(j, originalList.get(j + 1));
					originalList.set(j + 1, temp);
				}
				if (originalList.get(originalList.size() - j - 1) < originalList.get(originalList.size() - j - 2)) {
					temp = originalList.get(originalList.size() - j - 1);
					originalList.set(originalList.size() - j - 1, originalList.get(originalList.size() - j - 2));
					originalList.set(originalList.size() - j - 2, temp);
				}

			}
		}
	}
}
