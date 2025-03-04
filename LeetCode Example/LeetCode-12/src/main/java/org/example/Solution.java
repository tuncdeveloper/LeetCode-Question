package org.example;

class Solution {
    public static String categorizeBox(int length, int width, int height, int mass) {

        long volume = (long) length * width * height;

        if (((length >= Math.pow(10,4))||(width >= Math.pow(10,4))||(height >= Math.pow(10,4)))||(volume>=Math.pow(10,9))) {
            if (mass >= 100) {
                return "Both";
            }else {
                return "Bulky";
            }
        
        } else {
            if (mass >= 100) {
                return "Heavy";
            }  else {
                return "Neither";
            }
        }


    }

    public static void main(String[] args) {

        int length = 100;
        int width = 100;
        int height = 100;
        int mass = 100;
        System.out.println(categorizeBox(length,width,height,mass));
    }

}
