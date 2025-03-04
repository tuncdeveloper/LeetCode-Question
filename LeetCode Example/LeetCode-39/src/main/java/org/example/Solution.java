package org.example;

import java.util.*;

public class Solution {


    public static void main(String[] args) {

        int [] nums = {1,2,3,8,7,90};

        System.out.println(maxAscendingSum(nums));

    }


    public static int maxAscendingSum(int[] nums) {

        LinkedList<Integer> list = new LinkedList<>();




        int top = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                top =top+ nums[i];
            } else {
                list.add(top);
                top = nums[i];
            }
        }
        list.add(top);


        return Collections.max(list);
    }



}
