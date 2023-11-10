package com.pavan.recur.day6.Sorting.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumEqualsToTargetWhereNumberCanBeChoosenMultipleTimes {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int val = s.nextInt();
			arr[i] = val;
		}
		
		int givenSum = s.nextInt();
		
		finalArray = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> tempArr= new ArrayList<Integer>();
		allPosibleSum(arr, tempArr, 0, 0, givenSum);
		
		System.out.println(finalArray);

	}
	static ArrayList<ArrayList<Integer>> finalArray;
	
	public static void allPosibleSum(int[] arr, ArrayList<Integer> tempArr, int index, int currentSum, int givenSum) {
		
		
		if(currentSum>givenSum) return;
		
		if(index>=arr.length) return;
		
		if(currentSum == givenSum) {
			finalArray.add(new ArrayList(tempArr));
			return;
		}
		
		//choose same element
		tempArr.add(arr[index]);
		currentSum = currentSum+arr[index];
		allPosibleSum(arr, tempArr, index, currentSum, givenSum);
		
		/*
		 * //Choose next element currentSum = currentSum-arr[index]; allPosibleSum(arr,
		 * tempArr, index+1, currentSum, givenSum);
		 */
		
		// Not Choose
		tempArr.remove(new Integer(arr[index]));
		currentSum = currentSum-arr[index];
		allPosibleSum(arr, tempArr, index+1, currentSum, givenSum);
	}

}
