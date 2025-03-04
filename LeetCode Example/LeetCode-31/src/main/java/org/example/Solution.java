package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        for (int i : nums) {
            if (!seen.add(i) ) {
return true;
            }
        }



        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,4,3,5};
        System.out.println(containsDuplicate(nums));
    }
}
