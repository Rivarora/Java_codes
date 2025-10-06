package com.Riva.Day39;

public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) { // condition for odd numbers
                System.out.print(i + " ");
            }
        }
    }
}
