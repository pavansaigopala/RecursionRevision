package com.pavan.recur.day4.Sorting.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int val = s.nextInt();
			arr[i] = val;
		}

		mergeSorting(arr, 0, arr.length - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void mergeSorting(int[] arr, int start, int end) {

		if (start >= end)
			return;

		int midIndex = (start + end) / 2;

		mergeSorting(arr, start, midIndex);

		mergeSorting(arr, midIndex + 1, end);

		sorting(arr, start, midIndex, midIndex + 1, end);

	}

	public static void sorting(int[] arr, int startOfFirstArr,int endOfFirstArr, int startOfSecondArr, int endOfSecondArr) {
		
		int start= startOfFirstArr;
		//int end = endOfSecondArr;
		ArrayList<Integer> tempArr = new ArrayList<>();
		
		while(startOfFirstArr <= endOfFirstArr && startOfSecondArr<=endOfSecondArr ) {
			
			if(arr[startOfFirstArr] < arr[startOfSecondArr]) {
				tempArr.add(arr[startOfFirstArr]);
				startOfFirstArr++;
				
			}else {
				tempArr.add(arr[startOfSecondArr]);
				startOfSecondArr++;
			}
		}
		
		while(startOfFirstArr <= endOfFirstArr) {
			tempArr.add(arr[startOfFirstArr]);
			startOfFirstArr++;
		}
		
		while(startOfSecondArr<=endOfSecondArr ) {
			tempArr.add(arr[startOfSecondArr]);
			startOfSecondArr++;
		}
		
		for(int i = 0; i<tempArr.size(); i++) {
			arr[i+start] = tempArr.get(i);
		}
	}

}
