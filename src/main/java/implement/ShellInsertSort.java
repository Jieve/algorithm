package implement;

import java.util.List;

import interfaces.Sort;

/**
* @ClassName: ShellInsertSort
* @Description: 希尔插入排序算法实现
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
		if (null == originalList || originalList.isEmpty()) {
			return;
		}
		
	}
}
