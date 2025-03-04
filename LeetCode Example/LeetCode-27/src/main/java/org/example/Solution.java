package org.example;

public class Solution {

    public static boolean isBalanced(String num) {

        int cift = 0;
        int tek = 0;


        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (i%2 == 0) {
                cift+=digit;
            }else tek+=digit;
        }

        if (tek ==cift) {
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("24123"));
    }

}
