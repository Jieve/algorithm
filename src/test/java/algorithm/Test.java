package algorithm;

import java.util.LinkedList;
import java.util.List;

import implement.BinaryInsertionSort;
import implement.TwoPathInsertionSort;
import interfaces.Sort;

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
		list1.add(2);
		list1.add(1);
		// Sort binarySelectionSort = new StraightInsertionSort(list1);
		// Sort binaryInsertionSort = new BinaryInsertionSort(list1);

		Sort twoPathInsertionSort = new TwoPathInsertionSort(list1);
		twoPathInsertionSort.process();
		System.out.println(list1);

	}
}
