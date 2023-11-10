package com.pavan.recur.day5.Sorting.Practice;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		
		//Scanner s1 = new Scanner(System.in);

		//int n = s1.nextInt();

		int[] arr = {1,4,2,3};

		/*
		 * for (int i = 0; i < n; i++) { int val = s1.nextInt(); arr[i] = val; }
		 */

		quickSorting(arr, 0, 3);

		for (int i = 0; i < 4; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void quickSorting(int[] arr, int start, int end) {
		
		System.out.println("------------- start:"+start+ " end:"+end);
		for (int k = 0; k < 4; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
		if(start>=end) return;
		
		int partition = (start+end)/2;
		
		int i=start, j=end, pivot=arr[start];
		System.out.println("pivot:"+pivot + " i:"+i+" arr[i]:"+arr[i]+" j:"+j+" arr[j]:"+ arr[j]);
		while(i<j) {
			
			while(i<end && arr[i] <= pivot) {
				i++;
				System.out.println("i: "+ i);
			}
			
			System.out.println("Before: arr[j]:"+arr[j]+ "pivot:"+pivot);
			while(j>start && arr[j] >= pivot) {
				System.out.println("After j:"+ j+" arr[j]:"+arr[j]+ "pivot:"+pivot);
				j--;
				System.out.println("j: "+j);
			}
			
			System.out.println("before swap inside i: "+i);
			System.out.println("before swap inside j: "+j);
			if(i<j) {
				int temp = arr[start];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			System.out.println("Inside");
			for (int k = 0; k < 4; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
		// placing pivot at its right position
		// where left of pivot is less than pivot
		// right of pivot is greater than pivot
		int temp = arr[j];
		arr[j] = arr[start];
		arr[start] = temp;
		
		
		// Recursion Call for left or pivot and right of pivot
		quickSorting(arr, start, j-1);
		
		quickSorting(arr, j+1, end);
		
	}

}
