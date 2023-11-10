package com.pavan.recur.day2;

import java.util.Scanner;

public class FactorialOfN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//fact = factOfN(n);
		//fact = factOfN2(n, 1);
		factOfN3(n);
		System.out.println(fact);
	}

	static int fact=1;

	public static int factOfN1(int n) {

		if (n < 2)
			return 1;

		return n * factOfN1(n - 1);
	}

	public static int factOfN2(int n, int fact1) {

		if (fact1 == n)	return n;

		return fact1 * factOfN2(n,fact1+1);
	}
	
	public static void factOfN3(int i) {

		if (i==1)	return;

		fact = fact * i;
		
		factOfN3(i-1);
	}

}
