package com.java.tasks.acmp.arithmetic8;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Continue 1 esc 0");
        int esc = scanner.nextInt();
        boolean c = true;


        if (esc == 1) {
            System.out.println("Hello");
            System.out.println("Enter please number 3");
            int a = scanner.nextInt();

            while (c) {
                if (a == 3) {
                    int[] array = new int[a];
                    System.out.println("Enter please number A*B=C");
                    for (int b = 0; b < a; b++) {
                        array[b] = scanner.nextInt();
                    }
                    if (array[0] * array[1] != array[2]) {
                        System.out.println("No");
                        c = false;
                    } else {
                        System.out.println("Yes");
                    }
                } else {
                    System.out.println("Error");
                }
            }
        } else if (esc == 0) {
            System.out.println("By");
        }
    }
}



