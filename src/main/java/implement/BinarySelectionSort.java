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
public class BinarySelectionSort implements Sort {
	
	List<Integer> originalList = null;
	
	@Override
	public void process(List<Integer> originalList) {
		if (null == originalList||originalList.isEmpty()) {
			return;
		}
		this.originalList = originalList;
		int temp;
		int minIndex = 0;
		int maxIndex = this.originalList.size() - 1;
		int preCur;
		int lastCur;
		for (int i = 0; i < this.originalList.size()/2; i++) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int j = i + 1; j < this.originalList.size()-i; j++) {
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
			preCur = originalList.get(i);
			lastCur = originalList.get(this.originalList.size() - i -1);
			if (min < preCur) {
				originalList.set(i, min);
				originalList.set(minIndex, preCur);
			}
			if (max > lastCur) {
				originalList.set(this.originalList.size() - i -1, max);
				originalList.set(maxIndex, lastCur);
			}
		}
	}

}
