package com.java.tasks.acmp.salary0021;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write down how many workers: ");
        int worker = scanner.nextInt();
        System.out.print("Write salary of each worker: ");
        int min = 0;
        int max = 0;

        int[] array = new int[worker];
        for (int a = 0; a < worker; a++) {
            array[a] = scanner.nextInt();

            min = array[0];
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
            }
            max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.println("The difference between the maximum and minimum wages is: " + (max - min));
    }
}
