package org.example;

import java.util.Arrays;

class Solution {
    public static int[] plusOne(int[] digits) {

        boolean flag=true;

        int carry = 0;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                flag=false;
                break;
            }
        }

        if (!flag) {
            int ones = digits[digits.length-1];

            ones=ones+1;
            carry = ones / 10;
            ones = ones % 10;

            digits[digits.length-1]=ones;

            for (int i = digits.length - 2; i >= 0; i--) {

                digits[i] = digits[i] + carry;
                carry = digits[i] / 10;
                digits[i] = digits[i] % 10;

            }
        }else {
            int[] newDigits = new int[digits.length+1];

            for (int i = 0; i < newDigits.length-1; i++) {
                if (i == 0) {
                    newDigits[0]=1;
                }else {
                    newDigits[i]=0;
                }
            }
            return newDigits;
        }



        return digits;
    }

    public static void main(String[] args) {

        int[] digits = {0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
