package com.java.tasks.codeforces.watermelon;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        sum(number);
        scanner.close();
    }

    static boolean sum(int number) {
        if (number >= 4 && number % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return false;
    }
}
