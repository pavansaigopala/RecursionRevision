package com.pavan.recur.day2;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] raa = new int[n];
		
		for(int i=0; i<n; i++) {
			int val = s.nextInt();
			raa[i]=val;
		}
		
		//reverseAnArray(raa, 0, n-1);
		reverseAnArraySinglePointer(raa, 0, n-1);
		
		System.out.print("[");
		for(int i=0; i<n; i++) {
			System.out.print(raa[i]+",");
		}
		System.out.println("]");
		
	}
	
	public static void reverseAnArray(int[] raa, int i, int j) {
		if(i>=j) return;
		
		int temp= raa[i];
		raa[i] = raa[j];
		raa[j] = temp;
		
		reverseAnArray(raa, i+1, j-1);
	}
	
	public static void reverseAnArraySinglePointer(int[] raa, int i, int n) {
		if(i>(n/2)) return;
		
		int temp= raa[i];
		raa[i] = raa[n-i];
		raa[n-i] = temp;
		
		reverseAnArraySinglePointer(raa, i+1, n);
	}

}
