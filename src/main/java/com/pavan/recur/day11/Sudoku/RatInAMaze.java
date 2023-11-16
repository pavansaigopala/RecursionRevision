package com.pavan.recur.day11.Sudoku;

import java.util.ArrayList;
import java.util.Arrays;

public class RatInAMaze {
    public static void main(String[] args) {
        
    	int n = 4;
        int[][] m = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
    	result= new ArrayList<String>();
        boolean[][] index = new boolean[n][n];
        for( boolean row[]:index){
            Arrays.fill(row, false);
        }
        if(m[0][0]==0) System.out.println(result);
        helper(m,index,n,0,0,"");
        System.out.println(result);
    }
    public static ArrayList<String> result;
    public static void helper(int[][] m, boolean[][] index,int n, int row, int col, String path){
        
        if(row==(n-1) && col==(n-1)){
            result.add(path);
            return;
        }
        
        if(canIChooseThisWay(m,index,row+1, col, n)){
            index[row][col]=true;
            helper(m,index,n,row+1,col, path+"D");
            index[row][col]=false;
        }
        if(canIChooseThisWay(m,index,row, col-1, n)){
            index[row][col]=true;
            helper(m,index,n,row,col-1, path+"L");
            index[row][col]=false;
        }
        if(canIChooseThisWay(m,index,row, col+1,n)){
            index[row][col]=true;
            path=path.concat("R");
            helper(m,index,n,row,col+1, path);
            index[row][col]=false;
            path=path.substring(0, path.length() - 1);
        }
        if(canIChooseThisWay(m,index,row-1, col, n)){
            index[row][col]=true;
            helper(m,index,n,row-1,col, path+"U");
            index[row][col]=false;
        }
    }

public static boolean canIChooseThisWay(int[][] m, boolean[][] index, int row, int col, int n){
        if(row>=n || col>=n) return false;
        if(row<0 || col<0) return false;
        if(m[row][col]==0) return false;
        if(index[row][col]==true) return false;
        return true;
    }
}
