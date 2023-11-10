package com.pavan.recur.day2.twoRecursiveCalls;

import java.util.Scanner;
import java.util.Arrays;

public class FibonacciSeries {

	static int[] dp;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		dp = new int[n + 1];
		Arrays.fill(dp, -1);
		// int value = getNthFibonacciNumber(n);
		//int value = getNthFibonacciNumber2(n);
		
		// Optimal more with tabulation technique
		//int value = getNthFibonacciNumber3(n);
		
		// Optimalizing more without DP array
		int value = getNthFibonacciNumber4(n);
		
		System.out.println(value);
	}

	// TC: O(2^n) 
	// SC: O(n)
	public static int getNthFibonacciNumber(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);
	}

	
	// TC: O(n) 
	// SC: O(n)
	public static int getNthFibonacciNumber2(int n) {

		if (dp[n] != -1)
			return dp[n];
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		int x = getNthFibonacciNumber(n - 1);
		dp[n - 1] = x;

		int y = getNthFibonacciNumber(n - 2);
		dp[n - 2] = y;

		return dp[n] = x + y;
	}

	// TC: O(n) 
	// SC: O(n)
	public static int getNthFibonacciNumber3(int n) {
			
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2; i<=n ; i++)
		{
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		return dp[n];
		
	}
	
	
	// TC: O(n) 
	// SC: 1
	public static int getNthFibonacciNumber4(int n) {
		
		int x=0;
		int y=1;
		int z=1;
		for(int i=2; i<=n ; i++)
		{
			z = x + y;
			x = y;
			y = z;
		}
		
		return z;
		
	}

}
