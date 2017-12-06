package algorithm;

import java.util.LinkedList;
import java.util.List;

import com.jieve.algorithm.interfaces.Sort;
import com.jieve.algorithm.sort.implement.BinaryBubbleSort;
import com.jieve.algorithm.sort.implement.BinaryInsertionSort;
import com.jieve.algorithm.sort.implement.BubbleSort;
import com.jieve.algorithm.sort.implement.ImprovedBubbleSort;
import com.jieve.algorithm.sort.implement.MergeSort;
import com.jieve.algorithm.sort.implement.QuickSort;
import com.jieve.algorithm.sort.implement.ShellInsertSort;
import com.jieve.algorithm.sort.implement.TwoPathInsertionSort;

public class Test {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(7);
		list1.add(18);
		list1.add(5);
		list1.add(4);
		list1.add(12);
		list1.add(3);
		list1.add(7);
		list1.add(6);
		list1.add(17);
		list1.add(9);
		list1.add(11);
		list1.add(10);
		list1.add(10);
		list1.add(100);
		list1.add(10);
		list1.add(15);
		list1.add(109);
		list1.add(120);
		list1.add(2);
		list1.add(1);
		list1.add(14);
		list1.add(19);
		// Sort binarySelectionSort = new StraightInsertionSort(list1);
		// Sort binaryInsertionSort = new BinaryInsertionSort(list1);
//		Sort twoPathInsertionSort = new TwoPathInsertionSort(list1);
//		Sort shellInsertSort = new ShellInsertSort(list1);
//		Sort improvedBubbleSort = new ImprovedBubbleSort(list1);
//		Sort binaryBubbleSort = new BinaryBubbleSort(list1);
//		Sort quickSort = new QuickSort(list1);
		Sort mergeSort = new MergeSort(list1);
		mergeSort.process();
		System.out.println(list1);

	}
}
