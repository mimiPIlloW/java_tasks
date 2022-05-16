package com.java.tasks.acmp.cake539;

import java.util.Scanner;

public class Cake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guest = scanner.nextInt();
        if (guest == 1) {
            System.out.println("0");
        } else if (guest % 2 == 1) {
            System.out.println(guest);
        } else {
            System.out.println(guest / 2);
        }
        System.out.println();
        int number = (guest == 1) ? 0 : (guest % 2 == 1) ? guest : guest / 2;

        System.out.println(number);
    }
}
