package com.prep.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectSqaure {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        int[] values = new int[n];
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        List<Integer> perfectSquares = new ArrayList<>();

        for (int value : values) {
            if (isPerfectSquare(value)) {
                perfectSquares.add(value);
            }
        }

        System.out.print("Perfect square numbers: ");
        for (int square : perfectSquares) {
            System.out.print(square + " ");
        }

        // Close the scanner
        scanner.close();
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}

