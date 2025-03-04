package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public static int longestPalindrome(String s) {

        int polindromTop = 0;
        boolean flag = false;



        // Her karakterin kaç kez geçtiğini saymak için HashMap kullanıyoruz
        HashMap<Character, Integer> charCount = new HashMap<>();


        // İlk olarak her karakterin sayısını tutuyoruz
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

        }

        for (Integer count : charCount.values()) {
            if (count % 2 == 0) {
                polindromTop += count; // Çift sayılar tamamen kullanılır
            } else {
                polindromTop=polindromTop+count-1;
                flag=true;
            }
        }

        if (flag) {
            return polindromTop+1;
        }

        return polindromTop;
    }

    public static void main(String[] args) {
        String strs = "aabbbc";
        System.out.println(longestPalindrome(strs));  // Çıktı: 5
    }
}
