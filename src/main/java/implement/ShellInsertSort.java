package implement;

import java.util.List;

import interfaces.Sort;

/**
 * @ClassName: ShellInsertSort
 * @Description: 希尔插入排序算法实现(缩小增量排序),时效分析很难，关键码的比较次数与记录移动次数依赖于增量因子序列d的选取
 * @Description: 增量因子中除1 外没有公因子，且最后一个增量因子必须为1,希尔排序方法是一个不稳定的排序方法。
 * @author yyy
 * @date 2017年11月21日 下午6:04:45
 * 
 */
public class ShellInsertSort extends BaseSort implements Sort {
	public ShellInsertSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {
		if (null == originalList || originalList.size() <= 1) {
			return;
		}
		int d = originalList.size();
		int sentry;
		while (d > 1) {
			d /= 2;
			for (int i = 0; i < d; i++) {

				for (int j = 1; j * d + i < originalList.size(); j++) {
					sentry = originalList.get(j * d + i);
					for (int k = 0; k < j; k++) {
						if (sentry < originalList.get(k * d + i)) {
							for (int m = j - 1; m >= k; m--) {
								originalList.set((m + 1) * d + i, originalList.get(m * d + i));

							}
							originalList.set(k * d + i, sentry);
							break;
						}

					}
				}
			}

		}
	}
}
