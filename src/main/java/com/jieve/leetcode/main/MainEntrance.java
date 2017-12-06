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
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println("array:\t" + CollectionUtil.array2String(nums, 1));
		System.out.println("result:\t" + solution.findDisappearedNumbers(nums));
		
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
