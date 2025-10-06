package com.Riva.Day43;
import java.util.Scanner;

public class Cache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input cache size
        System.out.println("Enter the size of the cache:");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] cache = new String[size];
        int count = 0; // number of valid elements

        // Step 2: Enter number of operations
        System.out.println("Enter the number of operations:");
        int ops = sc.nextInt();
        sc.nextLine();

        // Step 3: Perform operations
        for (int i = 0; i < ops; i++) {
            System.out.println("Enter data:");
            String data = sc.nextLine();

            if (count < size) {
                // Shift right
                for (int j = count; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = data;
                count++;
            } else {
                // Cache full → shift all and replace front
                for (int j = size - 1; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = data;
            }

            // Step 4: Print cache state
            System.out.print("Cache: ");
            for (int k = 0; k < count; k++) {
                System.out.print(cache[k] + " ");
            }
            System.out.println();
        }
    }
}
