package com.Riva.Day39;

public class Sum {
    public static void main(String[] args) {
        int n = 10; // Example value
        int sum = 0, i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
