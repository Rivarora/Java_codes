package com.Riva.Day42;
import java.util.Scanner;
public class colSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("enter the number of columns:");
        int cols=sc.nextInt();
        int [][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int j=0;j<cols;j++){
            int sum=0;
            for(int i=0;i<rows;i++){
                sum+=arr[i][j];

            }
            System.out.println(sum);

        }
    }
}
