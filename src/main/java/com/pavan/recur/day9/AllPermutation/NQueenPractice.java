package com.pavan.recur.day9.AllPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NQueenPractice {
	
	public static void main(String[] args) {
		List<List<String>> str = solveNQueens(4);
		System.out.println(str);
	}
    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> mm = new ArrayList<List<String>>();
    
        char[][] board = new char[n][n];
        for(char[] c: board){
            Arrays.fill(c, '.');
        }

        List<List<String>> finalResult = new ArrayList<List<String>>();
        helper(n, board, 0, finalResult);
        return finalResult;
    }

    public static void helper(int n, char[][] matrix, int rowIndex,List<List<String>> finalResult ){

        if(rowIndex>=n){
            List<String> mat = new ArrayList<>();
            for (int i = 0; i < n; i++){
                String s="";
                for (int j = 0; j <n; j++){
                    char cc =  matrix[i][j];
                    String sTemp = String.valueOf(cc);
                     s = s.concat(sTemp);
                }
                mat.add(s);
            }
            finalResult.add(mat);
            return;
        }

        for(int cindex=0; cindex<n; cindex++){
            if(checkforQPlace(matrix, cindex, rowIndex, n)){
                matrix[rowIndex][cindex]='Q';
                helper(n, matrix, rowIndex+1,finalResult);
                matrix[rowIndex][cindex]='.';
            }
        }
    }

    public static boolean checkforQPlace(char[][] matrix, int column, int row, int n){

        // horizontal right side Row check
        int tCol = column, tRow = row;
        while(tCol<n){
            //System.out.println("tCol:"+tCol);
            //System.out.println("tRow:"+tRow);
            if( matrix[tRow][tCol]=='Q') return false;
            tCol++;
        }

        // horizontal left side Row check
        tCol = column; tRow = row;
        while(tCol>-1){
            if( matrix[tRow][tCol]=='Q') return false;
            tCol--;
        }

        // vertical Up side Column check
       tCol = column; tRow = row;
        while(tRow>-1){
            if( matrix[tRow][tCol]=='Q') return false;
            tRow--;
        }

        // vertical Down side Row check
        tCol = column; tRow = row;
        while(tRow<n){
            if( matrix[tRow][tCol]=='Q') return false;
            tRow++;
        }

        // Diagonal Up Right side Column check
        tCol = column; tRow = row;
        while(tRow>-1 && tCol<n){
            if( matrix[tRow][tCol]=='Q') return false;
            tRow--;
            tCol++;
        }

       // Diagonal Up left side Column check
        tCol = column; tRow = row;
        while(tRow>-1 && tCol>-1){
            if( matrix[tRow][tCol]=='Q') return false;
            tRow--;
            tCol--;
        }

        // Diagonal Down Right side Column check
        tCol = column; tRow = row;
        while(tRow<n && tCol<n){
            if( matrix[tRow][tCol]=='Q') return false;
            tRow++;
            tCol++;
        }

       // Diagonal Down left side Column check
        tCol = column; tRow = row;
        while(tRow<n && tCol>-1){
            if( matrix[tRow][tCol]=='Q') return false;
            tRow++;
            tCol--;
        }

        return true;
    }
}
