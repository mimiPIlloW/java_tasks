package com.java.tasks.acmp.olympiad;

import java.util.Scanner;

public class Olympiad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = 0;

        int[] array = new int[size];
        for (int a = 0; a < size; a++) {
            array[a] = scanner.nextInt();
            sum += array[a];
        }
        System.out.println(sum);
    }
}

