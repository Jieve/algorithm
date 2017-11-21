package implement;

import java.util.List;

import interfaces.Sort;

/**
 * @ClassName: StraightInsertionSort
 * @Description: 直接插入排序（算法简单，稳定<元素相等时，相对位置不会改变>、但最耗时）
 * @author yyy
 * @date 2017年11月16日 下午5:39:07
 * 
 */
public class StraightInsertionSort extends BaseSort implements Sort {

	public StraightInsertionSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {

		if (null == originalList || originalList.isEmpty()) {
			return;
		}
		int sentry;
		for (int i = 1; i < originalList.size(); i++) {
			// 有序序列逐个顺序遍历
			for (int j = 0; j < i; j++) {
				// 设立哨兵
				sentry = originalList.get(i);
				if (originalList.get(i) < originalList.get(j)) {
					for (int k = i - 1; k >= j; k--) {
						originalList.set(k + 1, originalList.get(k));
					}
					originalList.set(j, sentry);
				}

			}

		}

	}

}
