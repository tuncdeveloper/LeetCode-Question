package org.example;

import java.util.ArrayList;

class Solution {

    public static int romanToInt(String s) {

        int x = 0;

       ArrayList <Character> list = characters(s);

        for (int i = 0; i <s.length() ; i++) {
            switch(list.get(i))
            {
                case 'M':
                   x+=1000;
                    break;

                case 'D':
                    x+=500;
                    break;

                case 'C':
                    if (list.size()>i+1  && list.get(i+1) =='M') {
                        i=i+1;
                        x+=900;
                    } else if (list.size()>i+1  && list.get(i+1) =='D') {
                        i=i+1;
                        x+=400;
                    } else {
                        x+=100;
                    }
                    break;

                case 'L':
                    x+=50;
                    break;

                case 'X':
                    if (list.size()>i+1  && list.get(i+1) =='C') {

                        i=i+1;
                        x+=90;

                    } else if (list.size()>i+1  && list.get(i+1) =='L') {
                        i=i+1;
                        x+=40;
                    } else {
                        x+=10;
                    }
                    break;

                case 'V':
                    x+=5;
                    break;

                case 'I':
                    if (list.size()>i+1 && list.get(i+1) =='V') {
                        i=i+1;
                        x+=4;
                    } else if (list.size()>i+1 && list.get(i+1)=='X') {
                        i=i+1;
                        x+=9;
                    } else {
                        x+=1;
                    }
                    break;

                default :
                    return -1;
            }

        }

        return x;
    }

    public static ArrayList<Character> characters(String s){
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i <s.length(); i++) {
            list.add(s.charAt(i));

        }
        return list;
    }

    public static void main(String[] args) {

        String s = "MCDLXXVI";

        int latinNumber = romanToInt(s);

        System.out.println(latinNumber);

    }




}