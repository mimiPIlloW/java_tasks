package com.java.tasks.acmp.strawberry_picking755;

import java.util.Scanner;

public class StrawberryPicking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int[] array = new int[a];
        for (int b = 0; b < a; b++) {
            array[b] = scanner.nextInt();
        }
    }
}
