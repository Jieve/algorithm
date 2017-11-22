package implement;

import java.util.List;

import interfaces.Sort;

/**
 * @ClassName: BinarySelectionSort
 * @Description: 二分选择排序（优化的简单选择排序_双向）
 * @author yyy
 * @date 2017年11月14日 下午6:19:22
 * 
 */
public class BinarySelectionSort extends BaseSort implements Sort {

	public BinarySelectionSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {
		if (null == originalList || originalList.size() <= 1) {
			return;
		}

		for (int i = 0; i < this.originalList.size() / 2; i++) {
			int temp;
			int preCur = originalList.get(i);
			int lastCur = originalList.get(this.originalList.size() - i - 1);
			int minIndex = i;
			int maxIndex = this.originalList.size() - 1 - i;
			int min = originalList.get(i);
			int max = originalList.get(this.originalList.size() - i - 1);
			for (int j = i; j < this.originalList.size() - i; j++) {
				temp = originalList.get(j);
				if (temp < min) {
					min = temp;
					minIndex = j;
				}
				if (temp > max) {
					max = temp;
					maxIndex = j;
				}

			}
			// 头即为最大元素&&尾即为最小元素>>>>>直接交换两下标的元素
			if (Integer.compare(minIndex, this.originalList.size() - i - 1) == 0 && Integer.compare(maxIndex, i) == 0) {

				originalList.set(i, min);
				originalList.set(this.originalList.size() - i - 1, max);

			} else
			// 尾为最小元素
			if (Integer.compare(minIndex, this.originalList.size() - i - 1) == 0) {

				originalList.set(i, min);
				originalList.set(minIndex, preCur);
				lastCur = originalList.get(this.originalList.size() - i - 1);
				originalList.set(this.originalList.size() - i - 1, max);
				originalList.set(maxIndex, lastCur);
			} else
			// 头为最大元素
			if (Integer.compare(maxIndex, i) == 0) {
				originalList.set(this.originalList.size() - i - 1, max);
				originalList.set(maxIndex, lastCur);
				preCur = originalList.get(i);
				originalList.set(i, min);
				originalList.set(minIndex, preCur);

			} else {
				originalList.set(this.originalList.size() - i - 1, max);
				originalList.set(maxIndex, lastCur);
				preCur = originalList.get(i);
				originalList.set(i, min);
				originalList.set(minIndex, preCur);
			}
		}
	}

}
