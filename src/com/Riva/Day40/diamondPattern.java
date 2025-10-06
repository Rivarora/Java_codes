package com.Riva.Day40;

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number of rows: ");
        int n = sc.nextInt();  // must be odd

        int mid = n / 2;  // middle index

        // Top half including middle row
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" "); // spaces
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*"); // stars
            }
            System.out.println();
        }

        // Bottom half
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
