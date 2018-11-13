package com.jieve.leetcode.main;

import com.jieve.leetcode.Solution;
import com.jieve.utils.CollectionUtil;

public class MainEntrance {
	
	private static final Solution solution = Solution.INSTANCE;

	public static void main(String[] args) {
		
		//twoSum
		System.out.println("--------------------------------------------------twoSum---------------------------------------------------");
		int[] nums1 = {13,15,17,14,12,18,16,19,10,8};
		System.out.print("array:" + "\t");
		System.out.println(CollectionUtil.array2String(nums1, 1));
		nums1 = solution.twoSum(nums1, 36);
		System.out.print("result:" + "\t");
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + "\t");
		}
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		//arrayPairSum
		System.out.println("-----------------------------------------------arrayPairSum------------------------------------------------");
		int[] nums2 = {13,15,17,14,12,18,16,19,10,8};
		System.out.println("array:\t" + CollectionUtil.array2String(nums2, 1));
		int result = solution.arrayPairSum(nums2);
		System.out.println("result:\t" + result);
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		//matrixReshape
		System.out.println("----------------------------------------------matrixReshape------------------------------------------------");
		int[][] nums3 = {{1,5,7,3,9,3},{13,15,17,14,12,18},{16,19,10,8,5,22},{3,5,7,9,11,13}};
		int r = 3,c= 8;
		System.out.println("array:\t" + CollectionUtil.array2String(nums3, 2));
		int[][] nums4 = solution.matrixReshape(nums3, r, c);
		System.out.println("result:\t" + CollectionUtil.array2String(nums4, 2));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//Max Consecutive Ones
		System.out.println("----------------------------------------findMaxConsecutiveOnes---------------------------------------------");
		int[] nums5 = {1,0,1,0,1,0,0,1,1,1,1,1,0,0,0,1,0,1,1,1,1,1,0,1,0,1,0,0,1,0,1,0,1,1,1,1,1,1,1,1,0,0,1,0,1,1,0};
		System.out.println("array:\t" + CollectionUtil.array2String(nums5, 1));
		System.out.println("result:\t" + solution.findMaxConsecutiveOnes(nums5));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//maxAreaOfIsland
		System.out.println("----------------------------------------maxAreaOfIsland---------------------------------------------");
		int[][] grid = {{1,1,0,1,1},
				{1,0,0,0,0},
				{0,0,0,0,1},
				{1,1,0,1,1}};
		System.out.println("array:\t" + CollectionUtil.array2String(grid, 2));
		System.out.println("result:\t" + solution.maxAreaOfIsland(grid));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//findDisappearedNumbers
		System.out.println("----------------------------------------findDisappearedNumbers---------------------------------------------");
		int[] nums6 = {4,3,2,7,8,2,3,1};
		System.out.println("array:\t" + CollectionUtil.array2String(nums6, 1));
		System.out.println("result:\t" + solution.findDisappearedNumbers(nums6));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//1-bit and 2-bit Characters
		System.out.println("----------------------------------------1-bit and 2-bit Characters---------------------------------------------");
		int[] bits = {1,0,1,1,0,1,0,0};
		System.out.println("array:\t" + CollectionUtil.array2String(bits, 1));
		System.out.println("result:\t" + solution.isOneBitCharacter(bits));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//Move Zeroes
		System.out.println("----------------------------------------Move Zeroes---------------------------------------------");
		int[] nums7 = {0,1,0,3,12};
		System.out.println("array:\t" + CollectionUtil.array2String(nums7, 1));
		solution.moveZeroes(nums7);
		System.out.println("result:\t" + CollectionUtil.array2String(nums7, 1));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//maxProfit
		System.out.println("----------------------------------------maxProfit---------------------------------------------");
		int[] prices = {5,1,8,23,12,5,19};
		System.out.println("array:\t" + CollectionUtil.array2String(prices, 1));
		System.out.println("result:\t" + solution.maxProfit(prices));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//majorityElement
		System.out.println("----------------------------------------majorityElement---------------------------------------------");
		int[] nums8 = {5,5,6,6,6,5,5};
		System.out.println("array:\t" + CollectionUtil.array2String(nums8, 1));
		System.out.println("result:\t" + solution.majorityElement(nums8));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//twoSumA
		System.out.println("----------------------------------------twoSumA---------------------------------------------");
		int[] numbers = {3,24,50,79,88,150,345};
		System.out.println("array:\t" + CollectionUtil.array2String(numbers, 1));
		System.out.println("result:\t" + CollectionUtil.array2String(solution.twoSumA(numbers, 200), 1));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//Degree of an Array
		System.out.println("----------------------------------------Degree of an Array---------------------------------------------");
		int[] nums9 = {1,2,2,3,1,4,2};
		System.out.println("array:\t" + CollectionUtil.array2String(nums9, 1));
		System.out.println("result:\t" + solution.findShortestSubArray(nums9));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//Contains Duplicate
		System.out.println("----------------------------------------Contains Duplicate---------------------------------------------");
		int[] nums10 = {1,2,7,3,10,4,9};
		System.out.println("array:\t" + CollectionUtil.array2String(nums10, 1));
		System.out.println("result:\t" + solution.containsDuplicate(nums10));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		//Remove Duplicates from Sorted Array
		System.out.println("----------------------------------------Remove Duplicates from Sorted Array---------------------------------------------");
		int[] nums11 = {1,2,2,3,3,4,4,5,6,7,7,7,7,9};
		System.out.println("array:\t" + CollectionUtil.array2String(nums11, 1));
		System.out.println("result:\t" + "length: " + solution.removeDuplicates(nums11) + ",nums:" + CollectionUtil.array2String(nums11, 1));


		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	}

}
