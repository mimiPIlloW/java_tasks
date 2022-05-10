package com.java.tasks.codeforces.laying_dominoes50A;

import java.util.Scanner;

public class LayingDominoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int maxDominoes = (m * n) / 2;
        System.out.println(maxDominoes);
    }
}
