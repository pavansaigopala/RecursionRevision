package com.pavan.recur.day7.Sorting.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllPosibleSubset {

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
			
			if(index>=arr.length) {
				finalSumArr.add(new ArrayList<>(arrList));
				return;
			}
			
			// not pick condition
			helper(arr, index+1,arrList);
			
			// pick condition
			arrList.add(arr[index]);
			helper(arr, index+1, arrList);
			
			arrList.remove(new Integer(arr[index])); 
			
		}

}
