package com.java.tasks.codeforces.a_team;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    static final int PEOPLE_NUM = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tasks = scanner.nextInt();
        int[][] right = new int[tasks][PEOPLE_NUM];
        for (int a = 0; a < tasks; a++) {
            for (int b = 0; b < PEOPLE_NUM; b++) {
                right[a][b] = scanner.nextInt();
            }
        }
        System.out.println((int) Arrays.stream(right).filter(sureLine -> Arrays.stream(sureLine).sum() >= 2).count());
    }
}
