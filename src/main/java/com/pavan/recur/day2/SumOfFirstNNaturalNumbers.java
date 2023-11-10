package com.pavan.recur.day2;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum2 =sOFNNN2(n);
		System.out.println(sum2);
	}
	static int sum=0;
	public static void sOFNNN(int n) {
		if(n<=0) return;
		
		sum += n;
		
		sOFNNN(n-1);
		
		return;
	}
	
	
	public static int sOFNNN2(int n) {
		if(n<=0) return 0;
		return n + sOFNNN2(n-1);
	}
	

}
