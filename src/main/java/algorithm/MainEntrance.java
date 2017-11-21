package algorithm;

import java.io.IOException;
import java.util.List;

import implement.BinarySelectionSort;
import implement.HeapSort;
import implement.SimpleSelectionSort;
import implement.StraightInsertionSort;
import implement.TwoPathInsertionSort;
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
		List<Integer> list3 = null;
		List<Integer> list4 = null;
		List<Integer> list5 = null;
		List<Integer> list6 = null;
		try {
			list1 = FileUtil.getSortCondition("sort.data");
			list2 = FileUtil.getSortCondition("sort.data"); 
			list3 = FileUtil.getSortCondition("sort.data"); 
			list4 = FileUtil.getSortCondition("sort.data"); 
			list5 = FileUtil.getSortCondition("sort.data"); 
			list6 = FileUtil.getSortCondition("sort.data"); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Sort heapSort = new HeapSort(list1);
		Sort simpleSelectionSort = new SimpleSelectionSort(list2);
		Sort binarySelectionSort = new BinarySelectionSort(list3);
		Sort straightInsertionSort = new StraightInsertionSort(list4);
		Sort binaryInsertionSort = new BinarySelectionSort(list5);
		Sort twoPathInsertionSort = new TwoPathInsertionSort(list6);
		
		long start = System.nanoTime();
		heapSort.process();
		long end = System.nanoTime();
		System.out.println(list1);
		System.out.println("堆排序耗时：" + (end - start) + "ns");
		
		
		start = System.nanoTime();
		simpleSelectionSort.process();
		end = System.nanoTime();
		System.out.println(list2);
		System.out.println("简单选择排序耗时：" + (end - start) + "ns");
		
		start = System.nanoTime();
		binarySelectionSort.process();
		end = System.nanoTime();
		System.out.println(list3);
		System.out.println("二分选择排序耗时：" + (end - start) + "ns");
		
		
		start = System.nanoTime();
		straightInsertionSort.process();
		end = System.nanoTime();
		System.out.println(list4);
		System.out.println("直接插入排序耗时：" + (end - start) + "ns");
		
		start = System.nanoTime();
		binaryInsertionSort.process();
		end = System.nanoTime();
		System.out.println(list5);
		System.out.println("二分插入排序耗时：" + (end - start) + "ns");
		
		start = System.nanoTime();
		twoPathInsertionSort.process();
		end = System.nanoTime();
		System.out.println(list6);
		System.out.println("二路插入排序耗时：" + (end - start) + "ns");
		
		for (int i = 0; i < list1.size(); i++) {
			if (Integer.compare(list1.get(i), list2.get(i)) != 0) {
				System.out.println(i+ "_" + list1.get(i) + "_" + list2.get(i));
			}
			
		}
		System.out.println("1、2比较完毕");
		for (int i = 0; i < list1.size(); i++) {
			if (Integer.compare(list1.get(i), list3.get(i)) != 0) {
				System.out.println(i+ "_" + list1.get(i) + "_" + list3.get(i));
			}
			
		}
		System.out.println("1、3比较完毕");
		for (int i = 0; i < list1.size(); i++) {
			if (Integer.compare(list1.get(i), list4.get(i)) != 0) {
				System.out.println(i+ "_" + list1.get(i) + "_" + list4.get(i));
			}
			
		}
		System.out.println("1、4比较完毕");
		for (int i = 0; i < list1.size(); i++) {
			if (Integer.compare(list1.get(i), list5.get(i)) != 0) {
				System.out.println(i+ "_" + list1.get(i) + "_" + list5.get(i));
			}
			
		}
		System.out.println("1、5比较完毕");
		
		for (int i = 0; i < list1.size(); i++) {
			if (Integer.compare(list1.get(i), list6.get(i)) != 0) {
				System.out.println(i+ "_" + list1.get(i) + "_" + list6.get(i));
			}
			
		}
		System.out.println("1、6比较完毕");
//		//生成排序算法测试数据
//		try {
//			FileUtil.generateSortData("sort.data");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
