package com.Riva.Day39;

import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars with condition (hollow pyramid)
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == n)
                    System.out.print("*");
                else
                    System.out.print(" "); // hollow space
            }
            System.out.println();
        }

        sc.close();
    }
}
