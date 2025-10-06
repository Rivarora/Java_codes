package com.Riva.Day37;

public class Operator {
    public static void main(String[] args) {
        int a = 8, b = 3;

        // Arithmetic Operators
        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Assignment Operator
        a += 2;
        System.out.println("a += 2: " + a);

        // Unary Operator
        a++;
        System.out.println("a++: " + a);

        // Relational Operators
//        System.out.println("a == b: " + (a == b));
//        System.out.println("a != b: " + (a != b));
//        System.out.println("a > b: " + (a > b));

        // Logical Operators
//        boolean flag = (a > b) && (b > 0);
//        System.out.println("Logical AND: " + flag);

        // Bitwise Operator
        int bitwise = a & b;
        System.out.println("Bitwise AND: " + bitwise);

        // Ternary Operator
//        int x = (a > b) ? a : b;
//        System.out.println("Ternary max: " + x);
    }
}
