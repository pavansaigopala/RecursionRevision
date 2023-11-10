package com.pavan.recur.day3.ThirdRecursiveCalls;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintOnlyOneSubsqWhoseSumIsK {

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
		ArrayList<Integer> subsqList = new ArrayList<>();
		pOOneSubsqWhoseSumIsK(arr, 0, 0, subsqList);

	}

	public static boolean pOOneSubsqWhoseSumIsK(int arr[], int index, int tempSum, ArrayList<Integer> subsqList) {

		if (tempSum == sum) {
			System.out.println(subsqList);
			return true;
		}

		if (index >= arr.length)
			return false;

		// take
		tempSum += arr[index];
		subsqList.add(arr[index]);
		if (pOOneSubsqWhoseSumIsK(arr, index + 1, tempSum, subsqList) == true)
			return true;

		// not take
		tempSum -= arr[index];
		subsqList.remove(Integer.valueOf(arr[index]));
		if (pOOneSubsqWhoseSumIsK(arr, index + 1, tempSum, subsqList) == true)
			return true;

		return false;

	}

}
