package leetcode;

import com.jieve.leetcode.Solution;
import com.jieve.utils.CollectionUtil;

public class Test {
	private static final Solution solution = Solution.INSTANCE;

	public static void main(String[] args) {
//		int[] nums = {0,1,0,3,12};
//		int[] nums = {6,5,5};
////		solution.majorityElement(nums);
//		System.out.println(solution.majorityElement(nums));
		int[] num = {3,24,50,79,88,150,345};
		System.out.println(CollectionUtil.array2String(solution.twoSumA(num, 200), 1));
	}
}
