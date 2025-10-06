package com.Riva.Day40;

public class rightTriangle {
    public static void main(String[] args) {
        // Pattern 2: Right Triangle
        // Print a right-angled triangle with 5 rows.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
