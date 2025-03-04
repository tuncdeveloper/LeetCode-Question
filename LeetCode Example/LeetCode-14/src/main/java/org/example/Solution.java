package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public static String toHex(int num) {

        LinkedList<Integer> list = new LinkedList<>();

        if (num == 0) {
            return "0";
        }
        if (num == -2147483648) {
            return "80000000";
        }

        if (isSign(num)) {
            int temp=0;
            while (num!=0){

                temp = num%2;
                num=num/2;
                list.addFirst(temp);

            }

            while (list.size()!= 32) {
                list.addFirst(0); // Baştan 0 ekle
            }
        }
        else {
            int temp=0;
            num = -num;
            while (num!=0){

                temp = num%2;
                num=num/2;
                list.addFirst(temp);

            }

            while (list.size() != 32) {
                list.addFirst(0); // Baştan 0 ekle
            }

            boolean flag=true;


            int sum=0;
            for (int i = list.size() - 1; i >= 0; i--) {

                if (list.get(i) == 1 && flag) {
                    flag = false;
                    sum=0;
                }

                if (!flag) {
                    if (sum == 0) {
                        list.set(i, 1);
                    } else {
                        if (list.get(i) == 1) {
                            list.set(i, 0);
                        } else {
                            list.set(i, 1);
                        }
                    }
                }
                sum++;
            }
        }


        LinkedList<String>list1 = new LinkedList<>();

        for (int i = 0; i < list.size() / 4; i++) {

            int top = 0;

            for (int j = 0; j < 4; j++) {
                int index = list.size() - 1 - (i * 4 + j);

                if (index >= 0) {

                    top += (int) (Math.pow(2, j) * list.get(index));

                 } else {
                    break;
                }

            }

            if (top == 10) {
                list1.addFirst("a");
            } else if (top==11) {
                list1.addFirst("b");
            }else if (top==12) {
                list1.addFirst("c");
            }else if (top==13) {
                list1.addFirst("d");
            }else if (top==14) {
                list1.addFirst("e");
            }else if (top==15) {
                list1.addFirst("f");
            }else {
                list1.addFirst(String.valueOf(top));
            }

        }

            while (!list1.isEmpty() && list1.get(0).equals("0")) {
                list1.remove(0);
            }






        StringBuilder stringBuilder = new StringBuilder();
        for (String s : list1) {
            stringBuilder.append(s);
        }

        return stringBuilder.toString();
    }


    public static boolean isSign(int num){

        if (num>=0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = -2147483648;

        System.out.println(toHex(num));
    }
}
