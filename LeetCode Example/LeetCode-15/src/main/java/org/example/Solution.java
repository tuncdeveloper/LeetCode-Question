package org.example;

import java.util.ArrayList;

class Solution {
     public static int reverse(int x) {
        long result = 0;

         while (x != 0) {
             result = result * 10 + x % 10;
             x /= 10;

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0; // Taşma olursa 0 döndür
            }
        }

        return (int) result; // Sonucu güvenle 'int'e çevir
    }



    public static void main(String[] args) {

        System.out.println(reverse(123));

    }

}

