package org.example;

import java.util.LinkedList;

public class Solution {

    public static int smallestNumber(int n) {

        LinkedList<Integer>list = new LinkedList<>();

        do {
            int kalan = n % 2;
            list.addLast(kalan); // Binary soldan sağa yazılacağı için başa eklenir
            n = n / 2;
        } while (n != 0);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)== 0) {
                    list.set(i,1);
                }
            }

        int top =0;


        top = (int) (Math.pow(2,list.size())-1);



        return top;
    }

    public static void main(String[] args) {

        System.out.println(smallestNumber(4));
    }
}