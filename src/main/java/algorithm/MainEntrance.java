package algorithm;

import java.io.IOException;
import java.util.List;

import implement.HeapSort;
import implement.SimpleSelectionSort;
import interfaces.Sort;
import util.FileUtil;

/**
* @ClassName: MainEntrance
* @Description: 程序运行主入口
* @author yyy
* @date 2017年11月14日 下午2:11:01
* 
*/
public class MainEntrance {

	public static void main(String[] args) {
		
		List<Integer> list1 = null;
		List<Integer> list2 = null;
		try {
			list1 = FileUtil.getSortCondition("sort.data");
			list2 = FileUtil.getSortCondition("sort.data");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Sort heapSort = new HeapSort();
		Sort simpleSelectionSort = new SimpleSelectionSort();
		
		long start = System.nanoTime();
		heapSort.process(list1);
		long end = System.nanoTime();
		System.out.println(list1);
		System.out.println("堆排序耗时：" + (end - start) + "ns");
		
		
		start = System.nanoTime();
		simpleSelectionSort.process(list2);
		end = System.nanoTime();
		System.out.println(list2);
		System.out.println("简单选择排序耗时：" + (end - start) + "ns");
		
		
//		//生成排序算法测试数据
//		try {
//			FileUtil.generateSortData("sort.data");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
