package com.java.tasks.acmp.three_fat_men754;

import java.util.*;

public class ThreeFatMen {

    public static void main(String[] args) {
        ArrayList<Integer> weight = new ArrayList<>();
        boolean error = false;
        String out;
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            weight.add(Integer.valueOf(st.nextToken()));
        }
        for (Integer aWeight : weight) {
            if (aWeight < 94 || aWeight > 727) {
                error = true;
            }
        }
        weight.sort(Collections.reverseOrder()); // Сортировка в обратном порядке
        out = (error) ? "Error" : String.valueOf(weight.get(0));
        System.out.println(out);
    }
}

