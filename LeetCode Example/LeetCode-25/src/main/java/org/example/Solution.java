package org.example;

public class Solution {

    public static boolean canAliceWin(int n) {

        boolean flag = false; // alice, false ise bob

        int sayac = 10;

        while (n>0) {

            n=n-sayac;

            if (n<0) {
                return flag;
            }

            sayac--;
            flag=!flag;

        }

        return flag;
    }



    public static void main(String[] args) {
        System.out.println(canAliceWin(1));
    }
}
