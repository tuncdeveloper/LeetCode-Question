package org.example;

class Solution {
    public static int singleNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int top = 1;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    top=top+1;
                    break;
                }
            }

            if (top == 1) {
                return nums[i];
            }

        }

        return 0;

    }


    public static void main(String[] args) {
        int [] nums = {1,2,2,1,3};
        System.out.println(singleNumber(nums));
    }
}
