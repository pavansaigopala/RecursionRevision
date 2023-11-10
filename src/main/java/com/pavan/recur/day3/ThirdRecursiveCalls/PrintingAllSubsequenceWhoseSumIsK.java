package com.pavan.recur.day3.ThirdRecursiveCalls;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingAllSubsequenceWhoseSumIsK {

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
		pASWhoseSumIsK(arr, 0, 0,subsqList);
	}

	public static void pASWhoseSumIsK(int arr[], int index, int tempSum, ArrayList<Integer> subsqList) {

		

		if (index >= arr.length) {
			if (tempSum == sum) {
				System.out.println(subsqList);
			}
			return;
		}

		// take
		tempSum+=arr[index];
		subsqList.add(arr[index]);
		//System.out.println("take: "+subsqList);
		pASWhoseSumIsK(arr, index + 1, tempSum,subsqList);

		// not take
		tempSum-=arr[index];
		subsqList.remove(Integer.valueOf(arr[index]));
		//System.out.println("No take: "+subsqList);
		pASWhoseSumIsK(arr, index + 1, tempSum, subsqList);

	}

}
