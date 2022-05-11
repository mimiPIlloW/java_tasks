package com.java.tasks.acmp.basketball61;

import java.util.Scanner;

public class Basketball1_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int q1 = 0;
        int q2 = 0;

        int[] array = new int[a];
        for (int c = 0; c < a; c++) {
            array[c] = scanner.nextInt();
            if (array[c] % 2 != 0) {
                q1 += array[c];
            }
            if (array[c] % 2 == 0) {
                q2 += array[c];
            }
        }
        if (q1 > q2){
            System.out.println("1");
        } else if (q1 < q2) {
            System.out.println("2");
        }else {
            System.out.println("DRAW");
        }
    }
}

