package com.pavan.recur.day8.AllPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintAllPermutationsUsingExtraSpace {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int val = s.nextInt();
			arr[i] = val;
		}
		finalPermutationArr = new ArrayList<ArrayList<Integer>>();
		boolean[] bb = new boolean[n];
		Arrays.fill(bb, false);
		printAllPermutations(arr,new ArrayList<Integer>(), bb);
		System.out.println(finalPermutationArr);
	}
	
	static ArrayList<ArrayList<Integer>> finalPermutationArr;
	
	public static void printAllPermutations(int[] arr, ArrayList<Integer> arrList, boolean[] indexCheck) {
		
		//System.out.println(arrList);
		//System.out.println("finalPermutationArr: "+finalPermutationArr);
		for(int i=0; i<arr.length; i++) {
			if(indexCheck[i]==true) continue;
			else {
				indexCheck[i]=true;
				arrList.add(arr[i]);
				printAllPermutations(arr, arrList, indexCheck);
				if(arrList.size()==arr.length) finalPermutationArr.add(new ArrayList<>(arrList));
				indexCheck[i]=false;
				arrList.remove(arrList.size()-1);
			}
		}
	}
}
