package implement;

import java.util.List;

import interfaces.Sort;

/**
* @ClassName: StraightInsertionSort
* @Description: 直接插入排序（算法简单、最耗时）
* @author yyy
* @date 2017年11月16日 下午5:39:07
* 
*/
public class StraightInsertionSort extends BaseSort implements Sort {
	
	@Override
	public void process(List<Integer> originalList) {
		
		if (null == originalList||originalList.isEmpty()) {
			return;
		}
		this.originalList = originalList;
		int sentry;
		for (int i = 1; i < originalList.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (originalList.get(i) < originalList.get(j)) {
					sentry = originalList.get(i);
					for (int k = i - 1; k >=j; k--) {
						originalList.set(k + 1, originalList.get(k));
					}
					originalList.set(j, sentry);
				}
				
			}
			
		}

	}

}
