package com.Riva.Day40;

public class rectangle {
    public static void main(String[] args) {
        // Pattern 1: Solid Rectangle
        // Print a 4x5 rectangle of stars.
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
