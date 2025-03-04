package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static boolean isHappy(int n) {


        int basamak ;
        int top ;


        HashSet<Integer> hashSet = new HashSet<>();

        while (!hashSet.contains(n) ) {
        top=0;
            hashSet.add(n);
            while (n > 0) {

            basamak = n % 10;
            n = n / 10;

            top = top + basamak*basamak;

        }
        n=top;
            if (n ==1 ) {
                return true;
            }

    }

        return false;
    }


    public static void main(String[] args) {

        int n = 3;

        System.out.println(isHappy(n));
    }
}