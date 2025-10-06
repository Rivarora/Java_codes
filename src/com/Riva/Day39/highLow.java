package com.Riva.Day39;

public class highLow {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i > 5)
                System.out.println(i + " → High");
            else
                System.out.println(i + " → Low");
            i++;
        }
    }
}
