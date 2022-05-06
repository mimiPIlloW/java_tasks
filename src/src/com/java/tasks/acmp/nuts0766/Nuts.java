package com.java.tasks.acmp.nuts0766;

import java.util.Scanner;

public class Nuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a * b == c){
            System.out.println("Yes");
        }else if (a * b > c){
            System.out.println("Yes");
        } else if (a * b < c) {
            System.out.println("No");
        }else {
            System.out.println("Error");
        }
    }
}
