package com.pavan.recur.basicpract;

import java.util.Scanner;

public class RecursionBasic6Practice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Print Name 5 Times
		//name = s.nextLine();
		// prtName5Times(); 
		
		
		// Print Linearly from 1 - N
		//n = s.nextInt();
		//prtOneToN(1, n);
		
		
		// Print Linearly from N - 1
		//n = s.nextInt();
		//prtNToOne(n);
		
		
		// Print Linearly from 1 - N using BackTracking
		// call first , print next
		//n = s.nextInt();
		//prtOneToNUsingBackTracking(n);
		
		
		// Print Linearly from N - 1 using BackTracking
		// Striver said without using n -1
		// call first , print next
		n = s.nextInt();
		prtNToOneUsingBackTracking(1,n);
	}
	
	// Print Name 5 Times
	static String name;
	static int count=1;
	public static void prtName5Times() {
		if(count > 5) return;
		System.out.println(name + " "+ count);
		count++;
		prtName5Times();
	}
	
	
	// Print Linearly from 1 - N
	static int n;
	public static void prtOneToN(int i, int n) {
		if(i > n) return;
		System.out.println(i);
		prtOneToN(i+1, n);
	}
	
	
	
	// Print Linearly from N - 1
	public static void prtNToOne(int i) {
		if(i < 1) return;
		System.out.println(i);
		prtNToOne(i-1);
	}
	
	
	// Print Linearly from 1 - N using BackTracking
	public static void prtOneToNUsingBackTracking(int nn) {
		if(nn < 1) return;
		prtOneToNUsingBackTracking(nn-1);
		System.out.println(nn);
		
	}
	
	
	// Print Linearly from N - 1 using BackTracking
	// Striver said without using n -1
	public static void prtNToOneUsingBackTracking(int i, int n) {
		if(i > n) return;
		prtNToOneUsingBackTracking(i+1, n);
		System.out.println(i);
		
	}
	

}
