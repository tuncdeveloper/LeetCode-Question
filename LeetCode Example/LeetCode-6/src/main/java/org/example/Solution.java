package org.example;

class Solution {
    public static int climbStairs(int n) {


        int a = 1;
        int b = 1;
        int current = a+b ;

        for (int i = 0; i <n ; i++) {
            a=b;
            b=current;
            current = a+b;
        }


        return a;
    }

    public static void main(String[] args) {
        int x = 6; // Test için 3 basamaklı merdiven
        System.out.println(climbStairs(x)); // Çıktı: 3
    }
}

