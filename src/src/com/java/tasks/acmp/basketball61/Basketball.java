package com.java.tasks.acmp.basketball61;

import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[4][2];

        System.out.println("1 quarter");
        array[0][0] = scanner.nextInt();
        array[0][1] = scanner.nextInt();
        System.out.println("2 quarter");
        array[1][0] = scanner.nextInt();
        array[1][1] = scanner.nextInt();
        System.out.println("3 quarter");
        array[2][0] = scanner.nextInt();
        array[2][1] = scanner.nextInt();
        System.out.println("4 quarter");
        array[3][0] = scanner.nextInt();
        array[3][1] = scanner.nextInt();

        if (array[0][0] + array[1][0] + array[2][0] + array[3][0] > array[0][1] + array[1][1] + array[2][1] + array[3][1] ) {
            System.out.println("Win 1");
        } else if (array[0][0] + array[1][0] + array[2][0] + array[3][0] < array[0][1] + array[1][1] + array[2][1] + array[3][1] ) {
            System.out.println("Win 2");
        }else {
            System.out.println("DRAW");
        }
    }
}
