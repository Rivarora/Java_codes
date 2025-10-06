package com.Riva.Day45;
import java.util.Scanner;
public class linearSearch {
    public static void Search(int target,int [] arr){
        int found=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=1;
                index=i;
            }
        }
        if(found==0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at:"+index);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element:");
        int target=sc.nextInt();
        Search(target,arr);
    }
}
