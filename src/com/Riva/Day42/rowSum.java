package com.Riva.Day42;
import java.util.Scanner;
public class rowSum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the no. of columns:");
        int cols=sc.nextInt();
        int [][]mat=new int[rows][cols];
        System.out.println("Enter"+cols*rows+" no. of the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            int rowSum=0;
            for(int j=0;j<cols;j++){
                rowSum+=mat[i][j];
            }
            System.out.println(rowSum);
        }


    }
}
