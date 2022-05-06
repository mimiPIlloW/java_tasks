package com.java.tasks.acmp.enya0195;

import java.util.Scanner;

public class Enya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = ((b * c) * a) * 2;
        System.out.println(result);
    }
}
