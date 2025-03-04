package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.stream;

public class Solution {

    public static int removeElement(int[] nums, int val) {

        ArrayList<Integer>list = new ArrayList<>();
        int pointer = 0;
        int sayac=0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[pointer]=nums[i];
                pointer++;
            }else {
                sayac++;
            }
        }

        for (int i = 0; i < nums.length-sayac; i++) {
            System.out.print(nums[i]+" ");
        }System.out.println();

        return nums.length - sayac;
    }
    public static void main(String[] args) {

        int [] dizi = {3,3,2,2};

        System.out.println(removeElement(dizi,3));
    }
}
