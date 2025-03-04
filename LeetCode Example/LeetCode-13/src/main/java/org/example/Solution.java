package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public static String[] sortPeople(String[] names, int[] heights) {

        int temp;
        HashMap<Integer,String> map = new HashMap<>();


        for (int i = 0; i < names.length; i++) {
            map.put(heights[i],names[i]);

        }

        Arrays.sort(heights);

       /* for (int i = 0; i < heights.length; i++) {
            for (int j = i+1; j < heights.length; j++) {

                if (heights[i] < heights[j]) {
                    temp=heights[j];
                    heights[j]=heights[i];
                    heights[i]=temp;
                }

            }
        }  */

        String[]dizi=new String[names.length];
        int j= names.length-1;

        for (int i = 0 ; i < names.length; i++,j--) {
            dizi[i]=map.get(heights[j]);
        }



        return dizi;
    }

    public static void main(String[] args) {
        String[]names = {"Mary","John","Emma"};
        int[]heights = {180,165,170};


        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
}
