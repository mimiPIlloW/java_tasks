package com.java.tasks.acmp.gulliver0773;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Gulliver {
    public static void main(String[] args) {
        int count;
        ArrayList<Integer> number = new ArrayList<>();
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            number.add(Integer.valueOf(st.nextToken()));
        }
        count = number.get(0) * number.get(0) * number.get(1);
        System.out.println(String.valueOf(count));
    }
}
