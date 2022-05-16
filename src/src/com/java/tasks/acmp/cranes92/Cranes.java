package com.java.tasks.acmp.cranes92;

import java.util.Scanner;

public class Cranes {
    public static void main(String[] args) {
        int boys;
        int girl;
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boys = value / 6;
        girl = value - boys * 2;

        System.out.println(boys + " " + girl + " " + boys);

    }
}
