package com.java.tasks.codeforces.way_too_long_words;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        sum(input);
        scanner.close();
    }

    static String sum(String input) {
        int lengthI = input.length();

        if (lengthI >= 5) {
            System.out.println(input.charAt(0) + "" + (lengthI - 2) + "" + input.charAt(lengthI - 1));
        } else {
            System.out.println(input);
        }
        return input;
    }
}
