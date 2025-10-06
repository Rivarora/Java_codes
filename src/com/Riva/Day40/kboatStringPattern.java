package com.Riva.Day40;
import java.util.Scanner;
public class kboatStringPattern {
       public static void main(String[]args){
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the string:");
           String word=sc.nextLine();
           int len=word.length();
           for(int i=0;i<len;i++){
               for(int j=i;j<len;j++){
                   char ch=word.charAt(j);
                   System.out.print(ch);
               }
               System.out.println();
           }
       }
}