package org.example;

public class Solution {

    public static int majorityElement(int[] nums) {


        for (int i = 0; i < nums.length; i++) {

            int top = 1;

            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    top++;
                }

            }
            if (top > nums.length/2) {
                return nums[i];
            }
        }
            return 0;
    }


    public static void main(String[] args) {
        int [] nums = {1,2,2,2,2,1,1};

        System.out.println(majorityElement(nums));
    }
}
