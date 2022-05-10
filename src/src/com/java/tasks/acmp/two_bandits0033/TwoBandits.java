package com.java.tasks.acmp.two_bandits0033;

import java.util.Scanner;

public class TwoBandits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Garri: ");
        int garri = scanner.nextInt();
        System.out.println("Larri: ");
        int larri = scanner.nextInt();

        int all = garri + larri - 1;

        System.out.println("Garri:" + (all - garri) + "\n" + "Larri: " + (all - larri));
    }
}
