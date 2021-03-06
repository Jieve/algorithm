package com.jieve.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jieve.utils.CollectionUtil;

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
	
	/**
	* @Title: maximumProduct
	* @Description: Given an integer array, find three numbers whose product is maximum and output the maximum product.
	* @Url: https://leetcode.com/problems/maximum-product-of-three-numbers/description/
	* @param @param nums
	* @param @return    param
	* @return int    returnType
	* @throws
	*/
	public int maximumProduct(int[] nums) {
		
		Entity max = new Entity(true, 3);
		Entity min = new Entity(false, 2);
		
		for (int i = 0; i < nums.length; i++) {
			max.push(nums[i]);
			min.push(nums[i]);
		}
		System.out.println(max.getList());
		System.out.println(min.getList());
		return Math.max(min.getList().getLast()*min.getList().getFirst()*max.getList().getLast(), max.getList().getLast()*max.getList().getFirst()*max.getList().get(1));
    }
	
	/**
	* @ClassName: Entity
	* @Description: maximumProduct使用内部类
	* @author yyy
	* @date 2018年3月21日 下午1:12:16
	* 
	*/
	class Entity {
		
		/**
		 * 标识大小堆
		 */
		private boolean flag;
		
		/**
		 * 定义集合大小
		 */
		private int size;
		
		/**
		 * 集合容器
		 */
		private LinkedList<Integer> list = new LinkedList<>();
		

		public Entity(boolean flag, int size) {
			super();
			this.flag = flag;
			this.size = size;
		}


		public boolean isFlag() {
			return flag;
		}


		public void setFlag(boolean flag) {
			this.flag = flag;
		}


		public int getSize() {
			return size;
		}


		public void setSize(int size) {
			this.size = size;
		}


		public LinkedList<Integer> getList() {
			return list;
		}


		public void setList(LinkedList<Integer> list) {
			this.list = list;
		}


		public void push(Integer num) {
			if (list.size() < size) {
				list.add(num);
				Collections.sort(list);
			}else {
				if (flag) {
					
					if (num > list.get(0)) {
						list.set(0, num);
						Collections.sort(list);
					}
				} else {
					if (num < list.get(size - 1)) {
						list.set(size - 1, num);
						Collections.sort(list);
					}
				}
			}
		}

	}
	
	/**
	* @Title: isToeplitzMatrix
	* @Description: A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
	* @Url: https://leetcode.com/problems/toeplitz-matrix/description/
	* @param @param matrix
	* @param @return    param
	* @return boolean    returnType
	* @throws
	*/
	public boolean isToeplitzMatrix(int[][] matrix) {
		Set<Integer> set = new HashSet<>();
		for (int i = -matrix.length+1; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i+j>=0&&i+j<matrix[0].length) {
					set.add(matrix[j][i+j]);
				}
			}
			if (set.size() != 1) {
				return false;
			}
			set.clear();
		}
		return true;
	}
	
	/**
	* @Title: imageSmoother
	* @Description: Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.
	* @Url: https://leetcode.com/problems/image-smoother/description/
	* @param @param M
	* @param @return    param
	* @return int[][]    returnType
	* @throws
	*/
	public int[][] imageSmoother(int[][] M) {
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		int[][] result = new int[M.length][M[0].length];
		for (int i = 0; i < M.length; i++) {
			
			for (int j = 0; j < M[0].length; j++) {
				
				for (int m = i-1; m <= i+1; m++) {
					for (int n = j-1; n <= j+1; n++) {
						if (m>=0&&m<M.length&&n>=0&&n<M[0].length) {
							list.add(M[m][n]);
						}
					}
				}
				for (int num : list) {
					sum += num;
				}
				result[i][j] = sum/list.size();
				list.clear();
				sum = 0;
			}
		}
		return result;
        
    }
	
	/**
	* @Title: missingNumber
	* @Description: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
	* @Url: https://leetcode.com/problems/missing-number/description/
	* @param @param nums
	* @param @return    param
	* @return int    returnType
	* @throws
	*/
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		
		System.out.println(CollectionUtil.array2String(nums, 1));
		int result = 0;
		for (int i = 0; i < nums.length/2 + 1; i++) {
			if (i!=nums[i]) {
				result = i;
				break;
			}
			if (nums.length-i!=nums[nums.length-i-1]) {
				result = nums.length-i;
				break;
			}
		}
		return result;
    }

	/**
	 * @Title: removeDuplicates
	 * @Description: Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
	 * @Url: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	 * @param @param nums
	 * @param @return    param
	 * @return int    returnType
	 * @throws
	 */
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int flag = nums[0];
		int length = 1;
		int pos = 1;
		for (int i = 1; i < nums.length; i++) {
			if(flag != nums[i]) {
				length++;
				flag = nums[i];
				nums[pos] = nums[i];
				pos++;
			}
		}
		return length;
	}

}
