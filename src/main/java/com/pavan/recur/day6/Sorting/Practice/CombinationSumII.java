package com.pavan.recur.day6.Sorting.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSumII {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int val = s.nextInt();
			arr[i] = val;
		}

		int target = s.nextInt();

		finalArray = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		combinationSumII(arr, tempArr, 0, 0, target);

		System.out.println(finalArray);
	}

	static ArrayList<ArrayList<Integer>> finalArray;

	public static void combinationSumII(int[] arr, ArrayList<Integer> tempArr, int index, int currentSum, int target) {

		if(currentSum == target) {
			finalArray.add(new ArrayList<>(tempArr));
		}
		
		if(currentSum>target) return;
		
		for(int i=index; i<arr.length; i++) {
			
			if((i!=index) && arr[i-1]==arr[i]) continue;
			
			tempArr.add(arr[i]);
			currentSum+=arr[i];
			combinationSumII(arr, tempArr, i+1, currentSum, target);
			
			tempArr.remove(tempArr.size()-1);
			currentSum-=arr[i];
		}
	}
}
