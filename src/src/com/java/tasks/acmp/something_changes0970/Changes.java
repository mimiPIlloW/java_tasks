package com.java.tasks.acmp.something_changes0970;

import java.util.Arrays;
import java.util.Scanner;

public class Changes {
    int add(int[] all, int l) {
        Scanner scanner = new Scanner(System.in);
        all = new int[l];
        for (int a = 0; a <= all.length - 1; a++) {
            all[a] = scanner.nextInt();

        }
        return setAll(all);
    }


    public void result(int l, int[] all) {
        for (int a = 0; a <= all.length; a++) {
            if (all[0] + all[1] != all[2]) {
                int temp = all[0];
                all[0] = all[1];
                all[1] = temp;
                int temp1 = all[0];
                all[0] = all[2];
                all[2] = temp1;
                if (all[0] + all[1] != all[2] && a == 3) {
                    System.out.println("No ");
                    break;
                }
            } else {
                sum = all[0] + all[1];
                System.out.println(Arrays.toString(all));
                System.out.println("Yes " + sum);
                break;
            }
        }
    }


    private int l = 3;
    private int sum = 0;
    private int[] all = new int[0];

    public int getL() {
        return l;
    }


    public int[] getAll() {
        return all;
    }

    public int setAll(int[] all) {
        this.all = all;
        return 0;
    }

}
