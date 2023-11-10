package com.pavan.recur.day2;

import java.util.Scanner;

public class CheckStringIsPalindromeOrNot {

	static boolean result = true;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		//stringPalindromeCheck1(str, 0, str.length() - 1);
		//result = stringPalindromeCheck2(str, 0, str.length() - 1);
		result = stringPalindromeCheck3(str, 0);
		System.out.println(result);
	}

	public static void stringPalindromeCheck1(String str, int i, int j) {

		if (i > j)
			return;

		if (str.charAt(i) != str.charAt(j)) {
			result = false;
			return;
		}

		stringPalindromeCheck1(str, i + 1, j - 1);
	}

	public static boolean stringPalindromeCheck2(String str, int i, int j) {

		if (i > j)
			return true;

		if (str.charAt(i) != str.charAt(j)) {
			return false;
		}

		return stringPalindromeCheck2(str, i + 1, j - 1);
	}
	
	public static boolean stringPalindromeCheck3(String str, int i) {

		if (i > (str.length()/2))
			return true;

		if (str.charAt(i) != str.charAt(str.length()-1-i)) {
			return false;
		}

		return stringPalindromeCheck3(str, i + 1);
	}

}
