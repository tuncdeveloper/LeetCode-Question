package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int[] separateDigits(int[] nums) {

        int top = 0 ;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> tempList = new ArrayList<>();

            while (nums[i]>0){

                tempList.add(nums[i]%10);
               nums[i]=nums[i]/10;

                top++;
            }
            Collections.reverse(tempList);
            list.addAll(tempList);



        }

              return list.stream().mapToInt(i -> i).toArray();



    }

    public static void main(String[] args) {

        int [] nums = {13,25,83,77};

        System.out.println(separateDigits(nums));
    }
}