package com.jieve.algorithm.main;

import java.io.IOException;
import java.util.List;

import com.jieve.algorithm.interfaces.Sort;
import com.jieve.algorithm.sort.implement.BinaryBubbleSort;
import com.jieve.algorithm.sort.implement.BinarySelectionSort;
import com.jieve.algorithm.sort.implement.BubbleSort;
import com.jieve.algorithm.sort.implement.HeapSort;
import com.jieve.algorithm.sort.implement.ImprovedBubbleSort;
import com.jieve.algorithm.sort.implement.MergeSort;
import com.jieve.algorithm.sort.implement.QuickSort;
import com.jieve.algorithm.sort.implement.ShellInsertSort;
import com.jieve.algorithm.sort.implement.SimpleSelectionSort;
import com.jieve.algorithm.sort.implement.StraightInsertionSort;
import com.jieve.algorithm.sort.implement.TwoPathInsertionSort;
import com.jieve.utils.CollectionUtil;
import com.jieve.utils.FileUtil;

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
		List<Integer> list7 = null;
		List<Integer> list8 = null;
		List<Integer> list9 = null;
		List<Integer> list10 = null;
		List<Integer> list11 = null;
		List<Integer> list12 = null;
		try {
			list1 = FileUtil.getSortCondition("sort.data");
			list2 = FileUtil.getSortCondition("sort.data");
			list3 = FileUtil.getSortCondition("sort.data");
			list4 = FileUtil.getSortCondition("sort.data");
			list5 = FileUtil.getSortCondition("sort.data");
			list6 = FileUtil.getSortCondition("sort.data");
			list7 = FileUtil.getSortCondition("sort.data");
			list8 = FileUtil.getSortCondition("sort.data");
			list9 = FileUtil.getSortCondition("sort.data");
			list10 = FileUtil.getSortCondition("sort.data");
			list11 = FileUtil.getSortCondition("sort.data");
			list12 = FileUtil.getSortCondition("sort.data");
		} catch (IOException e) {
			e.printStackTrace();
		}

		Sort heapSort = new HeapSort(list1);
		Sort simpleSelectionSort = new SimpleSelectionSort(list2);
		Sort binarySelectionSort = new BinarySelectionSort(list3);
		Sort straightInsertionSort = new StraightInsertionSort(list4);
		Sort binaryInsertionSort = new BinarySelectionSort(list5);
		Sort twoPathInsertionSort = new TwoPathInsertionSort(list6);
		Sort shellInsertSort = new ShellInsertSort(list7);
		Sort bubbleSort = new BubbleSort(list8);
		Sort improvedBubbleSort = new ImprovedBubbleSort(list9);
		Sort binaryBubbleSort = new BinaryBubbleSort(list10);
		Sort quickSort = new QuickSort(list11);
		Sort mergeSort = new MergeSort(list12);
		
		long start = System.nanoTime();
		heapSort.process();
		long end = System.nanoTime();
//		System.out.println(list1);
		System.out.println("堆排序耗时：" + (end - start) + "ns");
		
		System.out.println("作为比较的模板链产出");
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		start = System.nanoTime();
		simpleSelectionSort.process();
		end = System.nanoTime();
//		System.out.println(list2);
		System.out.println("简单选择排序耗时：" + (end - start) + "ns");
		
		System.out.println("1、2比较开始");
		if (CollectionUtil.equals(list1, list2)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		start = System.nanoTime();
		binarySelectionSort.process();
		end = System.nanoTime();
//		System.out.println(list3);
		System.out.println("二分选择排序耗时：" + (end - start) + "ns");
		
		System.out.println("1、3比较开始");
		if (CollectionUtil.equals(list1, list3)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		start = System.nanoTime();
		straightInsertionSort.process();
		end = System.nanoTime();
//		System.out.println(list4);
		System.out.println("直接插入排序耗时：" + (end - start) + "ns");
		
		System.out.println("1、4比较开始");
		if (CollectionUtil.equals(list1, list4)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		start = System.nanoTime();
		binaryInsertionSort.process();
		end = System.nanoTime();
//		System.out.println(list5);
		System.out.println("二分插入排序耗时：" + (end - start) + "ns");
		
		System.out.println("1、5比较开始");
		if (CollectionUtil.equals(list1, list5)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		start = System.nanoTime();
		twoPathInsertionSort.process();
		end = System.nanoTime();
//		System.out.println(list6);
		System.out.println("二路插入排序耗时：" + (end - start) + "ns");
		
		System.out.println("1、6比较开始");
		if (CollectionUtil.equals(list1, list6)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		start = System.nanoTime();
		shellInsertSort.process();
		end = System.nanoTime();
//		System.out.println(list7);
		System.out.println("希尔插入排序耗时：" + (end - start) + "ns");
		
		System.out.println("1、7比较开始");
		if (CollectionUtil.equals(list1, list7)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		start = System.nanoTime();
		bubbleSort.process();
		end = System.nanoTime();
//		System.out.println(list8);
		System.out.println("冒泡排序耗时：" + (end - start) + "ns");
		
		System.out.println("1、8比较开始");
		if (CollectionUtil.equals(list1, list8)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		start = System.nanoTime();
		improvedBubbleSort.process();
		end = System.nanoTime();
//		System.out.println(list9);
		System.out.println("改善的冒泡排序耗时：" + (end - start) + "ns");
		
		System.out.println("1、9比较开始");
		if (CollectionUtil.equals(list1, list9)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		start = System.nanoTime();
		binaryBubbleSort.process();
		end = System.nanoTime();
//		System.out.println(list10);
		System.out.println("改善的冒泡排序(折半)耗时：" + (end - start) + "ns");
		
		System.out.println("1、10比较开始");
		if (CollectionUtil.equals(list1, list10)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		start = System.nanoTime();
		quickSort.process();
		end = System.nanoTime();
//		System.out.println(list11);
		System.out.println("快速排序耗时：" + (end - start) + "ns");
		
		System.out.println("1、11比较开始");
		if (CollectionUtil.equals(list1, list11)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		start = System.nanoTime();
		mergeSort.process();
		end = System.nanoTime();
//		System.out.println(list11);
		System.out.println("归并排序耗时：" + (end - start) + "ns");
		
		System.out.println("1、12比较开始");
		if (CollectionUtil.equals(list1, list12)) {
			System.out.println("并无差异");
		}else {
			System.out.println("差异如上");
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		
		// //生成排序算法测试数据
		// try {
		// FileUtil.generateSortData("sort.data");
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

	}

}
