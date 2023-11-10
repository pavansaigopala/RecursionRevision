package com.pavan.recur.day7.Sorting.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllPosibleSubsetWithOutDuplicates {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int val = s.nextInt();
			arr[i] = val;
		}
		finalSumArr = new ArrayList<ArrayList<Integer>>();
		helper(arr, 0, new ArrayList<Integer>());
		System.out.println(finalSumArr);
		
	}
	
	static ArrayList<ArrayList<Integer>> finalSumArr;
	
	public static void helper(int[] arr, int index, ArrayList<Integer> arrList) {
		
		finalSumArr.add(new ArrayList<>(arrList));
		//if(index>=arr.length) return;
		
		for(int i=index; i<arr.length; i++) {
			
			if((i!=index) && arr[i-1] == arr[i]) continue;
			
			arrList.add(arr[i]);
			helper(arr, index+1, arrList);
			arrList.remove(arrList.size()-1);
			
		}
	}
}
