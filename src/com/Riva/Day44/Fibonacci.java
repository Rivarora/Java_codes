package com.Riva.Day44;
import java.util.Scanner;
public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        int a = 0, b = 1;
//        System.out.print(a + " " + b);
//        for (int i = 2; i < n; i++) {
//            int temp = a + b;
//            System.out.print(" "+temp+" ");
//            a = b;
//            b = temp;
//        }
//    }
    public static int fibo(int n){
         if(n==0){
             return 0;
         }
         if(n==1){
             return 1;
         }
         return fibo(n-2)+fibo(n-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
