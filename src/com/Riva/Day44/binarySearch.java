//package com.Riva.Day44;
//import java.util.Scanner;
//public class binarySearch {
//    public static int Sort(int left,int right,int target,int [] arr){
//        if(left>right){
//            return -1;
//        }
//        int mid=(left+right)/2;
//        if(arr[mid]==target){
//            return mid;
//        }
//        if(arr[mid]>target){
//            return Sort(left,mid-1,target,arr);
//        }
//        if(arr[mid]<target){
//            return Sort(mid+1,right,target,arr);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array:");
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        System.out.println("Enter"+" "+n+" "+"elements:");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Enter the value of Target:");
//        int target=sc.nextInt();
//        int left=arr[0];
//        int right=arr[arr.length-1];
//    }
//}
