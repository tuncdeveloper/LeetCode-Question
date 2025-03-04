package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public static void moveZeroes(int[] nums) {

        int size = nums.length;

        int pointer=0;

        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                nums[pointer]=nums[i];
                pointer++;
            }
        }
        for (int i = pointer; i <size ; i++) {
            nums[i]=0;
        }


    }

    public static void main(String[] args) {

        int[] dizi = {0,1,0,3,12};

        moveZeroes(dizi);
    }


}

