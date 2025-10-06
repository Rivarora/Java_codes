package com.Riva.Day50;
import java.util.*;
public class practiseJava {
    //    //* 1 2 3
//    //* * 4 5
//    //* * * 6
//    //* * * *
//
//        public static void main(String[] args) {
//            int num = 1;
//            int rows = 4;
//
//            for (int i = 1; i <= rows; i++) {
//                // print stars
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//
//                // print numbers (only until last row)
//                if (i < rows) {
//                    for (int k = 1; k <= rows - i; k++) {
//                        System.out.print(num + " ");
//                        num++;
//                    }
//                }
//
//                // move to next line after each row
//                System.out.println();
//            }
//        }
//   public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of rows for mat1:");
//        int rows=sc.nextInt();
//        System.out.println("Enter the number of columns for mat1:");
//        int columns=sc.nextInt();
//        int [][]mat=new int[rows][columns];
//        System.out.println("Enter"+rows*columns+"elements for mat1:");
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<columns;j++){
//                mat[i][j]=sc.nextInt();
//            }
//        }
//
//       System.out.println("Enter"+rows*columns+"elements for mat2:");
//        int [][]mat2=new int[rows][columns];
//       for(int i=0;i<rows;i++){
//           for(int j=0;j<columns;j++){
//               mat2[i][j]=sc.nextInt();
//           }
//       }
//
//    }
//    static void quickSort(int []arr,int left,int right){
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter size of array: ");
//    int n = sc.nextInt();
//
//    int[] arr = new int[n];
//    System.out.println("Enter elements of array:");
//    for (int i = 0; i < n; i++) {
//        arr[i] = sc.nextInt();
//    }
//
//    quickSort(arr, 0, n - 1);
//
//    System.out.println("Sorted Array: " + Arrays.toString(arr));
//}
//    public static int BinarySearch(int []arr,int target){
//        Arrays.sort(arr);
//        return Arrays.binarySearch(arr,target);
//    }
//public static void main(String[] args) {
//    int[] arr = {1, 3, 5, 7, 9, 11, 13};
//    int target = 7;
//
//    int result = BinarySearch(arr, target);
//
//    if (result == -1)
//        System.out.println("Element not found.");
//    else
//        System.out.println("Element found at index: " + result);
//}
//    public static int fibo(int n){
//        if(n==0){
//            return 0;
//        }
//        if(n==1) {
//            return 1;
//        }
//        return fibo(n-1)+fibo(n-2);
//    }
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(fibo(n));
//    }
//
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=sc.nextInt();
        int val=sc.nextInt();

        for(int i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=val;
        n++;

            System.out.println(Arrays.toString(arr));


    }
}
