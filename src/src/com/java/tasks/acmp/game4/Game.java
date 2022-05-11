package com.java.tasks.acmp.game4;

import java.util.Scanner;

public class Game {
    public static int NUMBER = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println(a + "" + NUMBER + (NUMBER - a));
    }
}
