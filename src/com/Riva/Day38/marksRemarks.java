package com.Riva.Day38;

import java.util.Scanner;

public class marksRemarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0–100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter between 0–100.");
        } else {
            // Using if-else
            if (marks >= 90) {
                System.out.println("If-Else: Excellent");
            } else if (marks >= 75) {
                System.out.println("If-Else: Good");
            } else if (marks >= 50) {
                System.out.println("If-Else: Average");
            } else {
                System.out.println("If-Else: Fail");
            }

            // Using switch (marks / 10)
            switch (marks / 10) {
                case 10: case 9:
                    System.out.println("Switch: Excellent");
                    break;
                case 8: case 7:
                    System.out.println("Switch: Good");
                    break;
                case 6: case 5:
                    System.out.println("Switch: Average");
                    break;
                default:
                    System.out.println("Switch: Fail");
            }
        }

        sc.close();
    }
}
