package com.Riva.Day39;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }

        sc.close();
    }
}
