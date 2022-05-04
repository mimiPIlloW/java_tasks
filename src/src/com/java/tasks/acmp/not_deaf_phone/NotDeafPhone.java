package com.java.tasks.acmp.not_deaf_phone;

import java.util.Scanner;

public class NotDeafPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input ");
        int input = scanner.nextInt();

        boolean trueB = true;
        while (trueB) {
            if (input > 0 && input <= 100) {
                int output = input;
                System.out.println("Output " + output);
                trueB = false;
            } else {
                System.out.println("Error please enter");
            }
        }
    }
}
