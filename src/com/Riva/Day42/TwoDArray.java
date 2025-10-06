package com.Riva.Day42;
import java.util.Scanner;
public class TwoDArray {
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows:");
       int rows=sc.nextInt();
       System.out.println("Enter the number of columns:");
       int columns=sc.nextInt();
       int[][] arr = new int[rows][columns];
       for(int i=0;i<rows;i++) {
           for (int j = 0; j < columns; j++) {
               arr[i][j] = sc.nextInt();
           }}
           int max = arr[0][0];
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < columns; j++) {
                   if (arr[i][j] > max) {
                       max = arr[i][j];

                   }
               }
               System.out.println("Maximum element:" + max);
           }
       }
   }


