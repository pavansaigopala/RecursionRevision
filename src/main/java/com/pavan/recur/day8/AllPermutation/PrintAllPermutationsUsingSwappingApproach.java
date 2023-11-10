package com.pavan.recur.day8.AllPermutation;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllPermutationsUsingSwappingApproach {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int val = s.nextInt();
			arr[i] = val;
		}
		finalPermutationArr = new ArrayList<ArrayList<Integer>>();
		printAllPermutationsUsingSwap(arr,0);
		System.out.println(finalPermutationArr);
	}
	
	static ArrayList<ArrayList<Integer>> finalPermutationArr;
	
	public static void printAllPermutationsUsingSwap(int[] arr, int swapIndex) {
		
			if(swapIndex >= arr.length) {
				ArrayList<Integer> al = new ArrayList<>();
				for(int x: arr) {
					al.add(x);
				}
				finalPermutationArr.add(al);
				return;
			}
			
			for(int i=swapIndex; i<arr.length; i++) {
				swap(arr, i, swapIndex);
				printAllPermutationsUsingSwap(arr, swapIndex+1);
				swap(arr, i, swapIndex);
			}
		}
	

	public static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}

