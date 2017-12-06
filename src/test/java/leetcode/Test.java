package leetcode;

import com.jieve.leetcode.Solution;

public class Test {
	private static final Solution solution = Solution.INSTANCE;

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(solution.findDisappearedNumbers(nums));
	}
}
