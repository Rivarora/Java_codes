package com.Riva.Day45;
import java.util.Scanner;
public class binarySearch {
    public static int search(int target,int []arr){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int target=sc.nextInt();
        int result=search(target,arr);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index:"+result);
        }
    }
}
