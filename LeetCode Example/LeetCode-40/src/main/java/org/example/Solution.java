package org.example;

public class Solution {

    public static void main(String[] args) {
        int n=27;
        System.out.println(isPowerOfThree(n));
    }

    private static boolean isPowerOfThree(int n) {

        if (n == 1) {
            return true;
        } else if (n%3!=0 || n<0) {
            return false;
        }

            return isPowerOfThree(n/3);
    }


}
