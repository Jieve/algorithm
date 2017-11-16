package implement;

import java.util.List;

import interfaces.Sort;

public class BinaryInsertionSort extends BaseSort implements Sort {

	public BinaryInsertionSort(List<Integer> originalList) {
		super(originalList);
	}

	@Override
	public void process() {
		if (null == originalList || originalList.isEmpty()) {
			return;
		}
		for (int i = 1; i < originalList.size(); i++) {

			int j = 0;
			int k = i - 1;
			while (j != k) {
				System.out.println("j:" + j + ", k:" + k);
				System.out.println((j + k) / 2);
				if (originalList.get(i) < originalList.get((j + k) / 2)) {
					j = (j + k) / 2;
				} else if (originalList.get(i) > originalList.get((j + k) / 2)) {
					k = (j + k) / 2;
				}
				System.out.println("j:" + j + ", k:" + k);
			}
			for (int f = i - 1; f >= j; f--) {
				originalList.set(k + 1, originalList.get(k));
			}

		}
	}

}
