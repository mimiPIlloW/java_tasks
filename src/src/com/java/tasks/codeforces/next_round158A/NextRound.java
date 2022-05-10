package com.java.tasks.codeforces.next_round158A;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nParticipant = scanner.nextInt();
        int kPlace = scanner.nextInt();
        int sum = 0;

        int[] array = new int[nParticipant];
        for (int a = 0; a < nParticipant; a++) {
            array[a] = scanner.nextInt();
            if (array[a] > kPlace) {
                sum = a + 1;
            }
        }
        System.out.println(sum);
    }
}

