package com.jieve.hearsay.main;

import com.jieve.hearsay.Solution;

public class MainEntrance {
	
	private static final Solution solution = Solution.INSTANCE;

	public static void main(String[] args) {
		
		//prime numbers sum
		System.out.println("--------------------------------------------------prime numbers sum---------------------------------------------------");
		int sum = solution.primeNumberSum();
		System.out.println(sum);
		
		System.out.println("\n" + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
