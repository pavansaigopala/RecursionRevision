package com.pavan.recur.day3.ThirdRecursiveCalls;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllSubsequence {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int val = s.nextInt();
			arr[i] = val;
		}

		tempArray = new ArrayList<>();
		//pAS(arr, 0);
		//pASTakeNotTake(arr, 0, tempArray);
		//pASTakeNotTakeOptimal(arr, 0);
	}

	public static void pAS(int[] arr, int i) {

		if (i >= arr.length)
			return;

		for (int j = i; j < arr.length; j++) {
			if (j == i)
				System.out.println(arr[j]);
			else
				System.out.println(arr[i] + " " + arr[j]);
		}
		pAS(arr, i + 1);
	}

	public static void pASTakeNotTake(int arr[], int index, ArrayList<Integer> tempArray) {

		if (index >= arr.length) {
			System.out.println(tempArray);
			return;
		}

		// not take
		pASTakeNotTake(arr, index + 1, tempArray);

		// take
		tempArray.add(arr[index]);
		pASTakeNotTake(arr, index + 1, tempArray);

		tempArray.remove(Integer.valueOf(arr[index]));

	}

	static ArrayList<Integer> tempArray;
	public static void pASTakeNotTakeOptimal(int arr[], int index) {

		if (index >= arr.length) {
			System.out.println(tempArray);
			return;
		}

		// not take
		pASTakeNotTake(arr, index + 1, tempArray);

		// take
		tempArray.add(arr[index]);
		pASTakeNotTake(arr, index + 1, tempArray);

		tempArray.remove(Integer.valueOf(arr[index]));

	}

}
