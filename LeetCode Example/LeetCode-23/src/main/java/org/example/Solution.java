package org.example;

public class Solution {

    public static int minMoves2(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int key = nums[i];
            int j=i-1;

            while (j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1]=key;
        }

        int ort;
        if (nums.length%2 != 0) {
           ort = nums[(nums.length/2)];
        }else {
            ort = (nums[nums.length/2]+nums[nums.length/2-1])/2;
        }

        int top = 0;

        for (int i = 0; i < nums.length; i++) {

            top = top + Math.abs(ort-nums[i]);


        }

        return top;
    }

    public static void main(String[] args) {
        int[] dizi = {1,10,2,9};


        System.out.println(minMoves2(dizi));
    }
}
