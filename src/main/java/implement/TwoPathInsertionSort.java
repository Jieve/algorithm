package implement;

import java.util.LinkedList;
import java.util.List;

import interfaces.Sort;

/**
 * @ClassName: TwoPathInsertionSort
 * @Description: 2-路插入排序算法，空间换时间的经典算法
 * @author yyy
 * @date 2017年11月17日 下午4:49:17
 * 
 */
public class TwoPathInsertionSort extends BaseSort implements Sort {

	public TwoPathInsertionSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {

		if (null == originalList || originalList.isEmpty()) {
			return;
		}
		List<Integer> targetList = new LinkedList<>();
		int start;
		int end;
		int median = 0;
		for (int i = 0; i < originalList.size(); i++) {
			if (targetList.isEmpty()) {
				targetList.add(originalList.get(i));
			} else {
				// 比最大的大
				if (originalList.get(i) >= targetList.get(targetList.size() - 1)) {
					targetList.add(originalList.get(i));
				} else
				// 比最小的小
				if (originalList.get(i) < targetList.get(0)) {
					// list长度+1
					targetList.add(0);
					for (int j = targetList.size() - 2; j >= 0; j--) {
						targetList.set(j + 1, targetList.get(j));

					}
					targetList.set(0, originalList.get(i));
				} else
				// 在最大与最小之间，使用二分插入法
				{
					start = 0;
					end = targetList.size() - 1;
					while (start <= end) {
						median = (start + end) / 2;
						if (originalList.get(i) > targetList.get(median)) {
							start = median + 1;
							median++;
						} else if (originalList.get(i) < targetList.get(median)) {
							end = median - 1;
						} else {
							while (originalList.get(i) == targetList.get(median)) {
								median++;
							}
							break;
						}
					}

					targetList.add(0);
					for (int j = targetList.size() - 2; j >= median; j--) {
						targetList.set(j + 1, targetList.get(j));

					}
					targetList.set(median, originalList.get(i));

				}
			}
		}

		// originalList = targetList;
		originalList.clear();
		originalList.addAll(targetList);

	}

}
