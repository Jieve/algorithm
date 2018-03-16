package com.jieve.hearsay;

public enum Solution {
	
	INSTANCE;
	
	/**
	* @Title: primeNumber
	* @Description: add prime numbers up from 100 to 200 && return the sum
	* @param @return    param
	* @return int    returnType
	* @throws
	*/
	public int primeNumberSum() {

		int sum = 0;
		boolean flag = false;

		for (int i = 101; i <= 200; i += 2) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(i);
				sum += i;
				System.out.println("sum :" + sum);
			}
			flag = false;
		}
		return sum;
	}

}
