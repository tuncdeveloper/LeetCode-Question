package org.example;

import java.util.HashMap;

class Solution {
    public static int singleNumber(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i+1);

        }




return 0;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,1,1,3};
        System.out.println(singleNumber(nums));
    }
}