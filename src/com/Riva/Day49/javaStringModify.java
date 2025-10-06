package com.Riva.Day49;
import java.util.Scanner;
import java.util.Scanner;
public class javaStringModify {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String original = sc.nextLine();


            char[] charArray = original.toCharArray();

            if (charArray.length > 0) {
                charArray[2] = 'A';
            }

            String modified = new String(charArray);


            System.out.println("Original String: " + original);
            System.out.println("Modified String: " + modified);

        }
    }

