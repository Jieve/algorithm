package implement;

import java.util.List;

import interfaces.Sort;
import util.MathUtil;

/**
 * @ClassName: HeapSort
 * @Description: 堆排序实现(本实例采用大堆方式)
 * @author yyy
 * @date 2017年11月14日 下午2:11:41
 * 
 */
public class HeapSort extends BaseSort implements Sort {

	int cur;
	int left;
	int right;
	int temp;

	public HeapSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {

		if (null == originalList || originalList.isEmpty()) {
			return;
		}

		int n = this.originalList.size();

		// max heap init
		for (int i = n / 2; i > 0; i--) {
			int j = i;
			traceExchange(j, n);
		}
		// rank
		int k;
		for (int i = 0; i < n - 1; i++) {
			int first = this.originalList.get(0);
			int rank = this.originalList.get(n - 1 - i);
			// swap
			temp = first;
			first = rank;
			rank = temp;
			this.originalList.set(0, first);
			this.originalList.set(n - 1 - i, rank);
			k = 1;
			traceExchange(k, n - 1 - i);

		}

	}

	/**
	 * @Title: traceExchange @Description: 自上而下初始化堆 @param @param
	 * j @param @param n param @return void returnType @throws
	 */
	private void traceExchange(int j, int n) {
		while ((2 * j - 1 < n && (this.originalList.get(j - 1) < this.originalList.get(2 * j - 1))
				|| (2 * j < n && this.originalList.get(j - 1) < this.originalList.get(2 * j)))) {
			cur = this.originalList.get(j - 1);
			left = this.originalList.get(2 * j - 1);
			right = 2 * j < n ? this.originalList.get(2 * j) : Integer.MIN_VALUE;
			if (MathUtil.toLeft(left, cur, right)) {
				this.originalList.set(2 * j - 1, cur);
				this.originalList.set(j - 1, left);
				j = 2 * j;

			} else if (MathUtil.toRight(left, cur, right)) {
				this.originalList.set(2 * j, cur);
				this.originalList.set(j - 1, right);
				j = 2 * j + 1;
			}

		}
	}

}
