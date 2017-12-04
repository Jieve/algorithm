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
	private int countArea(int[][] grid,int i,int j) {
		 if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return 0;  
	        if (grid[i][j] == 1)  
	        {  
	            grid[i][j] = 0;  
	            return  1 + countArea(grid, i, j + 1) + countArea(grid, i + 1, j)  
	                + countArea(grid, i, j - 1) + countArea(grid, i - 1, j);  
	        }  
	        return 0; 
		
	}

}
