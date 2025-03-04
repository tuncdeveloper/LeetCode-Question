package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> fizzBuzz(int n) {

        ArrayList<String>list = new ArrayList<>();
        int i=1;
        while (i!=n+1){

            if (i%3 == 0 && i%5!=0) {

                list.add("Fizz");
            } else if (i%5==0 && i%3!=0) {

                list.add("Buzz");
            } else if (i%3==0 && i%5==0) {

                list.add("FizzBuzz");
            }else {
                list.add(String.valueOf(i));
            }

            i++;
        }
        
        
        return list;
    }

    public static void main(String[] args) {

        int n = 15 ;
        
        System.out.println(fizzBuzz(n));
    }
}
