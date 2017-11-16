package algorithm;

import java.util.LinkedList;
import java.util.List;

import implement.BinarySelectionSort;
import interfaces.Sort;

public class Test {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(7);
		list1.add(6);
		list1.add(5);
		list1.add(4);
		list1.add(5);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		Sort binarySelectionSort = new BinarySelectionSort();
		binarySelectionSort.process(list1);
		System.out.println(list1);
		
		
	}
}
