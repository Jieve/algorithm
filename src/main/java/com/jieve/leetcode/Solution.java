package com.jieve.leetcode;

import java.util.Arrays;

public enum Solution {
	
	INSTANCE;

	/**
	* @Title: twoSum
	* @Description: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	* @Url: https://leetcode.com/problems/two-sum/description/
	* @param @param nums
	* @param @param target
	* @param @return
	* @return int[]
	* @throws
	*/
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

	/**
	* @Title: arrayPairSum
	* @Description: Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
	* @Url: https://leetcode.com/problems/array-partition-i/description/
	* @param @param nums
	* @param @return
	* @return int
	* @throws
	*/
	public int arrayPairSum(int[] nums) {

		if (nums.length % 2 != 0) {
			return 0;
		}
		//排序（归并）
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {

			if (i % 2 == 0) {
				sum += nums[i];
			}
		}
		return sum;
	}

	/**
	* @Title: matrixReshape
	* @Description: You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
	* @Url: https://leetcode.com/problems/reshape-the-matrix/description/
	* @param @param nums
	* @param @param r
	* @param @param c
	* @param @return
	* @return int[][]
	* @throws
	*/
	public int[][] matrixReshape(int[][] nums, int r, int c) {

		if (r * c != nums.length * nums[0].length) {
			return nums;
		}
		int[][] result = new int[r][c];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if ((nums[i].length * i + j + 1) % c == 0) {

					result[(nums[i].length * i + j + 1) / c - 1][c - 1] = nums[i][j];
				} else {
					result[(nums[i].length * i + j + 1) / c][(nums[i].length * i + j + 1) % c - 1] = nums[i][j];
				}
			}
		}

		return result;

	}

	/**
	* @Title: findMaxConsecutiveOnes
	* @Description: Given a binary array, find the maximum number of consecutive 1s in this array.
	* @Url: https://leetcode.com/problems/max-consecutive-ones/description/
	* @param @param nums
	* @param @return
	* @return int
	* @throws
	*/
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		if (nums.length >= 1) {

			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 1) {
					count++;
				} else {
					count = 0;
				}
				if (count > max) {
					max = count;
				}
			}
		}
		return max;
	}

}
