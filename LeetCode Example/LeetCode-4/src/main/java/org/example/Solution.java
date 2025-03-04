package org.example;

import java.util.ArrayList;

public class Solution {
    public static int removeDuplicates(int[] nums) {

        int sum=1;


        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[i-1]) {
                nums[sum]=nums[i];
                sum++;
            }
        }





        return sum;

    }


    public static void main(String[] args) {

        int[]dizi = {1,1,2};

        int k = removeDuplicates(dizi);
        System.out.println(k);

        System.out.print("[");
        for (int i = 0; i < k; i++) {
            System.out.print(dizi[i]);
            if (i != k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }


}
