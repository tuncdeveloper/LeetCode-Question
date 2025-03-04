package org.example;

public class Solution {
    public static int minMoves(int[] nums) {

        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min> nums[i]) {
                min=nums[i];
            }
        }

        int top=0;

        for (int i = 0; i < nums.length; i++) {
            top = top + nums[i] - min;
        }

        for (int num :  nums) {
            top = top+num-min;
        }

        return top;
    }

    public static void main(String[] args) {
        int[]dizi = {1,2,3};
        System.out.println(minMoves(dizi));
    }
}
