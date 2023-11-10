package com.pavan.recur.day3.ThirdRecursiveCalls;

import java.util.ArrayList;
import java.util.Scanner;

public class CountAllSubSqWhoseSumIsK {

	static int sum = 0;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int val = s.nextInt();
			arr[i] = val;
		}

		sum = s.nextInt();
		int count = countSubsqWhoseSumIsK(arr, 0,0);
		System.out.println(count);

	}
	
	public static int countSubsqWhoseSumIsK(int arr[], int index, int tempSum) {

		if (tempSum == sum) {
			return 1;
		}

		if (index >= arr.length)
			return 0;
		
		// take
		tempSum += arr[index];
		int left = countSubsqWhoseSumIsK(arr, index + 1, tempSum);
			

		// not take
		tempSum -= arr[index];
		int right = countSubsqWhoseSumIsK(arr, index + 1, tempSum);
			

		return left+right;

	}

}
