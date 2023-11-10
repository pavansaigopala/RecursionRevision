package com.pavan.recur.day7.Sorting.Practice;

import java.util.ArrayList;
import java.util.Scanner;

import com.pavan.recur.day4.Sorting.Practice.MergeSort;

public class SubsetSumInAscendingOrder extends MergeSort{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int val = s.nextInt();
			arr[i] = val;
		}
		finalSumArr = new ArrayList<>();
		helper(arr, 0, 0);
		int[] array = finalSumArr.stream().mapToInt(i -> i).toArray();
		mergeSorting(array, 0, array.length-1);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}
	
	static ArrayList<Integer> finalSumArr;
	public static void helper(int[] arr, int index, int elementSum) {
		
		if(index>=arr.length) {
			finalSumArr.add(elementSum);
			return;
		}
		
		// not pick condition
		helper(arr, index+1, elementSum);
		
		// pick condition
		elementSum += arr[index]; 
		helper(arr, index+1, elementSum);
		
		elementSum -= arr[index]; 
	}

}
