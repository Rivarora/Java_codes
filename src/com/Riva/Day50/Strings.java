package com.Riva.Day50;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Strings {
//    public static void main(String[]args){
//        String str="Python,java,c++";
//        StringTokenizer st=new StringTokenizer(str);
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
//    }
//Take a sentence string;
//count and print the number of words using StringTokenizer.
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter String");
//        String str=sc.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        int word=st.countTokens();
//        System.out.println("Total number of words:"+word);
//        System.out.println("Words:");
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
//    }
//Accept a string, convert to lowercase, and print its reverse (using StringBuilder/StringBuffer).
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String");
//        String s = sc.nextLine();
//        String lower=s.toLowerCase();
//        System.out.println("string in lowercase:"+lower);
//        StringBuffer sb=new StringBuffer(lower);
//        sb.reverse();
//        System.out.println("string in reverse:"+sb);
//    }
    //palindrome string
//    public static String palindrome(String s){
//        StringBuilder sb=new StringBuilder(s);
//        String rev=sb.reverse().toString();
//        return rev;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s=sc.nextLine();
//        if(palindrome(s).equals(s)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
//print longest word in a para
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s=sc.nextLine();
//        String[]words=s.split(" ");
//        String longest="";
//        for(int i=0;i<words.length;i++){
//            if(words[i].length()>longest.length()){
//                longest=words[i];
//            }
//        }
//        System.out.println(longest);}
    //remove duplicate characters from a string
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        String result="";
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(result.indexOf(ch)==-1){
//                result+=ch;
//            }
//        }
//        System.out.println(result);
//    }
    //count the occurence of substring in a string
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter String");
//        String str=sc.nextLine();
//        System.out.println("Enter subString");
//        String sub=sc.nextLine();
//        int index=0;
//        int count=0;
//        while(index!=-1){
//            index=str.indexOf(sub,index);
//            if(index!=-1){
//                count++;
//                index=index+sub.length();
//            }
//        }
//        System.out.println(count);
//    }
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String str = sc.nextLine();
//    String result="";
//    String[]words=str.split(" ");
//    for(int i=0;i<words.length;i++){
//        result+=words[i].substring(0,1).toUpperCase()+words[i].substring(1)+" ";
//    }
//    result=result.trim();
//    System.out.println(result);
//}
    //extract all numbers from a string
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String num="";
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch>='0' && ch<='9'){
//                num+=ch;
//            }
//        }
//        System.out.println(num);
//    }
    //reverse the string but preserve the word
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String[]words = s.split(" ");
//        String result="";
//        for(int i=0;i<words.length;i++){
//            String rev="";
//            for(int j=words[i].length()-1;j>=0;j--){
//                rev+=words[i].charAt(j);
//            }
//            result+=rev+" ";
//        }
//        result=result.trim();
//        System.out.println(result);
//    }
//    public static void quickSort(int[] arr,int left,int right){
//        int i=left;
//        int j=right;
//        int pivot=arr[(left+right)/2];
//        while(i<=j){
//            while(arr[i]<pivot){
//                i++;
//            }
//            while(arr[j]>pivot){
//                j--;
//            }
//            if(i <= j){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                i++;
//                j--;
//            }
//        }

//        if(left<j){
//            quickSort(arr,left,j);
//        }
//        if(i<right){
//            quickSort(arr,i,right);
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the length of the array");
//        int n=sc.nextInt();
//        int []arr= new int[n];
//        System.out.println("Enter the elements of the array");
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        int left=0,right=n-1;
//        quickSort(arr,left,right);
//        System.out.println(Arrays.toString(arr));
//
//    }

//public static void merge(int []arr,int left,int mid,int right){
//    int n1=mid-left+1;
//    int n2=right-mid;
//    int []L=new int[n1];
//    int []R=new int[n2];
//    for(int i=0;i<n1;i++){
//       L[i]=arr[left+i];
//    }
//    for(int j=0;j<n2;j++){
//        R[j]=arr[mid+j+1];
//    }
//    int i=0,j=0,k=left;
//    while(i<n1 && j<n2){
//
//        if(L[i]>=R[j]){
//                arr[k]=L[i];
//                i++;
//        }
//        else{
//            arr[k]=R[j];
//            j++;
//        }
//
//        k++;
//    }
//    while(i<n1){
//        arr[k]=L[i];
//        i++;
//        k++;
//    }
//    while(j<n2){
//        arr[k]=R[j];
//        j++;
//        k++;
//    }
//}
//public static void mergeSort(int []arr,int left,int right){
//    if(left<right){
//        int mid=left+(right-left)/2;
//
//    mergeSort(arr,left,mid);
//    mergeSort(arr,mid+1,right);
//    merge(arr,left,mid,right);
//}}
//public static void main(String[]args){
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter the size of array");
//    int n=sc.nextInt();
//    int []arr= new int[n];
//    System.out.println("Enter the elements of array");
//    for(int i=0;i<n;i++){
//        arr[i]=sc.nextInt();
//    }
//    mergeSort(arr,0,n-1);
//    System.out.println(Arrays.toString(arr));
//
//}
public static int pattern(int []a,int []b){
    int index=0;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<b.length;j++){
            if(a[i]!=b[j]){
                index=a[i];
            }
        }
    }
    return index;
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int m=sc.nextInt();
    int []b=new int[m];
    for(int i=0;i<m;i++){
        b[i]=sc.nextInt();
    }
    System.out.println(pattern(a,b));
}




}
