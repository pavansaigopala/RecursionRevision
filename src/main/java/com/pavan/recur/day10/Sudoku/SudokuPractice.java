package com.pavan.recur.day10.Sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SudokuPractice {

	public static void main(String[] args) {

		int[][] arr = { { 3, 1, 6, 5, 7, 8, 4, 9, 2 },
				{ 5, 2, 9, 1, 3, 4, 7, 6, 8 },
				{ 4, 8, 7, 6, 2, 9, 5, 3, 1 },
				{ 2, 6, 3, 0, 1, 5, 9, 8, 7 },
				{ 9, 7, 4, 8, 6, 0, 1, 2, 5 },
				{ 8, 5, 1, 7, 9, 2, 6, 4, 3 },
				{ 1, 3, 8, 0, 4, 7, 2, 0, 6 },
				{ 6, 9, 2, 3, 5, 1, 8, 7, 4 },
				{ 7, 4, 5, 0, 8, 6, 3, 1, 0 } };

		printAnyOnePosibleSudokuSol(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static boolean gotOnePossibility=false;
	public static boolean printAnyOnePosibleSudokuSol(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 0) {
					for(int k=1; k<=9;k++) {
						if(isPossible(k, i, j, arr)){
							arr[i][j]=k;
							if(printAnyOnePosibleSudokuSol(arr)) return true;
							else arr[i][j]=0;
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static boolean isPossible(int value, int row, int col,int[][] arr) {
		for(int i=0; i<=8; i++) {
			if(arr[i][col]==value) return false;
			
			if(arr[row][i]==value) return false;
			
			if(arr[3 * (row/3)+(i/3)][3 * (col/3)+(i%3)] == value) return false;
		}
		return true;
	}

}


/*
 
 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 0) {
					for(char k='1'; k<='9';k++) {
						if(isPossible(k, i, j, arr)){
							arr[i][j]=k;
							if(printAnyOnePosibleSudokuSol(arr)) return true;
							else arr[i][j]='.';
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static boolean isPossible(char value, int row, int col,char[][] arr) {
		for(int i=0; i<=8; i++) {
			if(arr[i][col]==value) return false;
			
			if(arr[row][i]==value) return false;
			
			if(arr[3 * (row/3)+(i/3)][3 * (col/3)+(i%3)] == value) return false;
		}
		return true;
	}
 
 * 
 */