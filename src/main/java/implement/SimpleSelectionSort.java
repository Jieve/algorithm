package implement;

import java.util.List;

import interfaces.Sort;

/**
* @ClassName: SimpleSelectionSort
* @Description: 简单选择排序（小值在前）
* @author yyy
* @date 2017年11月14日 下午5:50:14
* 
*/
public class SimpleSelectionSort implements Sort {
	
	List<Integer> originalList = null;

	@Override
	public void process(List<Integer> originalList) {
		if (null == originalList||originalList.isEmpty()) {
			return;
		}
		this.originalList = originalList;
		int temp;
		int index = 0;
		int cur;
		for (int i = 0; i < this.originalList.size(); i++) {
			int min = Integer.MAX_VALUE;
			for (int j = i + 1; j < this.originalList.size(); j++) {
				temp = originalList.get(j);
				if (temp < min) {
					min = temp;
					index = j;
				}
				
			}
			cur = originalList.get(i);
			if (min < cur) {
				originalList.set(i, min);
				originalList.set(index, cur);
			}
		}
	}

}
