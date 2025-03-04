package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static ArrayList<Integer> size(int n ){

        ArrayList arrayList = new ArrayList();
        while (n>0){
            arrayList.add(n%10);
            n=n/10;

        }


        Collections.reverse(arrayList);
    return arrayList;
    }


    public static boolean isSignal(int i){
        if (i%2 == 0) {
            return true;
        }
        return false;
    }

    public static int alternateDigitSum(int n) {


        int top = 0;
        System.out.println(size(n));

        int i=0;

        for (Integer number : size(n)) {

            if (isSignal(i)) {
                top = top+number;
            }else {
                top = top-number;
            }
            i++;
        }

        return top;
    }
    public static void main(String[] args) {

        int n = 521;
        System.out.println(alternateDigitSum(n));

    }
}