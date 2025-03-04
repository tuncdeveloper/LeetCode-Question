package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

class Solution {


    public static boolean isPalindrome(int x) {

        boolean flag =true;

        ArrayList<Integer> list = new ArrayList<>();
        int temp = 0;

        if (x < 0) {
            return false;
        }


        while (x!=0){

            temp = x%10;
            x = x/10;

            list.add(temp);

        }

        for (int i = 0; i < list.size(); i++) {

            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                return false;
            }

        }


        return flag;
    }


    public static void main(String[] args) {


        int x = -46864 ;

        System.out.println(isPalindrome(x));


    }
}

