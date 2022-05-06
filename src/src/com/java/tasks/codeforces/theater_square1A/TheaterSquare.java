package com.java.tasks.codeforces.theater_square1A;

import java.util.Scanner;

public class TheaterSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();

        int sum = 2;

        if (n > a) {
            sum *= (n + a - 1) / a;
        } else if (m > a) {
            sum *= (m + a - 1) / a;
        }
        System.out.println(sum);
    }
}
