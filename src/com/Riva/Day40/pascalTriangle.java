package com.Riva.Day40;
import java.util.Scanner;
public class pascalTriangle {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
           int num=1;
           for(int sp=0;sp<n-i;sp++){
               System.out.print(" ");
                          }
           for(int j=0;j<=i;j++){
               System.out.print(num+" ");
               num=num*(i-j)/(j+1);
           }
           System.out.println();

           }
       }
   }

