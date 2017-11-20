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
		int median;
		for (int i = 0; i < originalList.size(); i++) {
			if (targetList.isEmpty()) {
				targetList.add(originalList.get(i));
			}else {
				//比最大的大
				if (originalList.get(i)>=targetList.get(targetList.size()-1)) {
					targetList.add(originalList.get(i));
				} else 
					//比最小的小
					if (originalList.get(i)<targetList.get(0)){
						//list长度+1
						targetList.add(0);
						for (int j = targetList.size()-2; j >=0; j--) {
							targetList.set(j+1, targetList.get(j));
							
						}
						targetList.set(0, originalList.get(i));
				}else 
				//在最大与最小之间，使用二分插入法
				{
					start = 0;
					end = targetList.size()-1;
					while (start != end) {
						System.out.println("start:" + start + ", end:" + end);
						if (targetList.get((start + end)/2) > originalList.get(i)) {
							end = (start + end)/2;
						} else if(targetList.get((start + end)/2) < originalList.get(i)){
							start = (start + end)/2;
						}
					}
					targetList.add(0);
					for (int j = targetList.size()-1; j >= start; j--) {
						targetList.set(j+1, targetList.get(j));
						
					}
					targetList.set(start, originalList.get(i));
					
				}
			}
		}
	}

}
