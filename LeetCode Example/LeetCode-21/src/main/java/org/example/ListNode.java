package org.example;


class Solution {
    public static int minimumOperations(int[] nums) {
int yop =0;

        for (int i = 0; i < nums.length; i++) {

           if (nums[i]%3==1){

                nums[i]=nums[i]-1;
                yop++;


            }else if (nums[i]%3==2) {
                nums[i]=nums[i]+1;
yop++;
            }

        }

        return yop;
    }


    public static void main(String[] args) {
        int[]dizi = {1,2,3,4};

        System.out.print(minimumOperations(dizi));
    }
}