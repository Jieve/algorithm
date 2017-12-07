package com.jieve.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
	
	 /**
	* @Title: maxAreaOfIsland
	* @Description: Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
	* @Url: https://leetcode.com/problems/max-area-of-island/description/
	* @param @param grid
	* @param @return
	* @return int
	* @throws
	*/
	public int maxAreaOfIsland(int[][] grid) {
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				result = Math.max(result, countArea(grid, i, j));
			}
		}
		return result;
	}
	 
	 /**
	* @Title: countArea
	* @Description: DFS递归实现查找
	* @param @param grid
	* @param @param i
	* @param @param j
	* @param @return
	* @return int
	* @throws
	*/
	private int countArea(int[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
			return 0;
		if (grid[i][j] == 1) {
			grid[i][j] = 0;
			return 1 + countArea(grid, i, j + 1) + countArea(grid, i + 1, j) + countArea(grid, i, j - 1)
					+ countArea(grid, i - 1, j);
		}
		return 0;

	}
	
    /**
    * @Title: findDisappearedNumbers
    * @Description: Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.Find all the elements of [1, n] inclusive that do not appear in this array.
    * @Url: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    * @refer: https://www.cnblogs.com/grandyang/p/6222149.html
    * @param @param nums
    * @param @return
    * @return List<Integer>
    * @throws
    */
    public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			int idx = Math.abs(nums[i])-1;
			nums[idx] = nums[idx] > 0?-nums[idx]:nums[idx];
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]>0) {
				list.add(i+ 1);
			}
		}
		return list;
        
    }
    
	/**
	* @Title: isOneBitCharacter
	* @Description: We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
	* @Url: https://leetcode.com/problems/1-bit-and-2-bit-characters/description/
	* @refer： http://blog.csdn.net/mupengfei6688/article/details/78609842
	* @param @param bits
	* @param @return
	* @return boolean
	* @throws
	*/
	public boolean isOneBitCharacter(int[] bits) {

		int idx;
		for (idx = 0; idx < bits.length - 1;) {
			if (bits[idx] == 1) {
				idx += 2;
			} else {
				idx++;
			}
		}
		return idx == bits.length - 1;
	}

}
