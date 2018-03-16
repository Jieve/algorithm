package com.jieve.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	/**
	* @Title: moveZeroes
	* @Description: Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
	* @Url: https://leetcode.com/problems/move-zeroes/description/
	* @Note: 1、You must do this in-place without making a copy of the array.2、Minimize the total number of operations.
	* @param @param nums
	* @return void    returnType
	* @throws
	*/
	public void moveZeroes(int[] nums) {
		int count = 0;
		int idx = 0;
		while (idx < nums.length-count) {
			if (nums[idx] == 0) {
				count++;
				for (int j = idx + 1; j <= nums.length - count; j++) {
					nums[j - 1] = nums[j];
				}
				nums[nums.length-count] = 0;
				idx--;
			}
			idx++;
		}
	}
	
	/**
	* @Title: maxProfit
	* @Description: Design an algorithm to find the maximum profit.
	* @Url: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
	* @refer: https://www.cnblogs.com/grandyang/p/4280803.html
	* @param @param prices
	* @param @return
	* @return int
	* @throws
	*/
	public int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i]>prices[i-1]) {
				profit += prices[i]-prices[i-1];
			}
		}
		return profit;
        
    }
	
	/**
	* @Title: majorityElement
	* @Description: Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.You may assume that the array is non-empty and the majority element always exist in the array.
	* @Url: https://leetcode.com/problems/majority-element/description/
	* @param @param nums
	* @param @return
	* @return int
	* @throws
	*/
	public int majorityElement(int[] nums) {
		int cur = nums[0];
		int count = 0;
		int curCount;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			curCount = map.get(nums[i])==null?0:map.get(nums[i]);
			map.put(nums[i], ++curCount);
			cur = count<curCount?nums[i]:cur;
			count = count<curCount?curCount:count;
			if (count>nums.length/2) {
				break;
			}
		}
		return cur;
        
    }
	
	/**
	* @Title: twoSumA
	* @Description: Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
	* @Url: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
	* @param @param numbers
	* @param @param target
	* @param @return
	* @return int[]
	* @throws
	*/
	public int[] twoSumA(int[] numbers, int target) {
		int[] result = new int[2];
		int i = 0;
		boolean flag = true;
		while (i < numbers.length && numbers[i] <= target && flag) {

			for (int j = i + 1; j < numbers.length && numbers[j] <= target - numbers[i]; j++) {
				if (numbers[i] + numbers[j] == target) {
					result[0] = i + 1;
					result[1] = j + 1;
					flag = false;
					break;
				}
			}
			i++;
		}
		return result;
	}
	
	/**
	* @Title: findShortestSubArray
	* @Description: Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
	* @Url: https://leetcode.com/problems/degree-of-an-array/description/
	* @param @param nums
	* @param @return
	* @return int
	* @throws
	*/
	public int findShortestSubArray(int[] nums) {
		String start = "start";
		String degree = "degree";
		int curDegree = 0;
		int shortestLength = 0;

		Map<Integer, Map<String, Integer>> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				Map<String, Integer> record = new HashMap<>();
				record.put(start, i);
				record.put(degree, 1);
				map.put(nums[i], record);
			} else {
				map.get(nums[i]).put(degree, map.get(nums[i]).get(degree) + 1);
			}
			if (curDegree < map.get(nums[i]).get(degree)) {
				curDegree = map.get(nums[i]).get(degree);
				shortestLength = i - map.get(nums[i]).get(start) + 1;
			} else if (curDegree == map.get(nums[i]).get(degree)) {
				shortestLength = shortestLength < i - map.get(nums[i]).get(start) + 1 ? shortestLength
						: i - map.get(nums[i]).get(start) + 1;
			}
		}
		return shortestLength;
	}
	
	/**
	* @Title: containsDuplicate
	* @Description: Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
	* @Url: https://leetcode.com/problems/contains-duplicate/description/
	* @param @param nums
	* @param @return
	* @return boolean
	* @throws
	*/
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		return nums.length != set.size();
	}
	
	public int maximumProduct(int[] nums) {
		int temp;
		for (int i = 2; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (nums[j]>nums[i]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		for (int i = 3; i < nums.length; i++) {
			if (nums[i]>=nums[2]) {
				nums[0] = nums[1];
				nums[1] = nums[2];
				nums[2] = nums[i];
			} else if (nums[i]>=nums[1]) {
				nums[0] = nums[1];
				nums[1] = nums[i];
			}else if (nums[i]>=nums[0]) {
				nums[0] = nums[i];
			}
			
		}
		return nums[0]*nums[1]*nums[2];
    }
}
