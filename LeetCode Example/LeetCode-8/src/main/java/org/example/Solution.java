package org.example;

import java.util.ArrayList;

class Solution {
    public static boolean isValid(String s) {

        ArrayList<Character> characters = new ArrayList<>();

        // String'i karakterlere ayır ve listeye ekle
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }

        boolean found = true;

        // Eşleşen çiftleri kaldırdıkça döngüyü devam ettir
        while (found) {
            found = false; // Başlangıçta eşleşme bulunmadı olarak işaretle
            for (int i = 0; i < characters.size() - 1; i++) {
                if ((characters.get(i) == '(' && characters.get(i + 1) == ')') ||
                        (characters.get(i) == '[' && characters.get(i + 1) == ']') ||
                        (characters.get(i) == '{' && characters.get(i + 1) == '}')) {
                    // Eşleşen çifti listeden kaldır
                    characters.remove(i + 1);
                    characters.remove(i);
                    found = true; // Eşleşme bulundu
                    break; // Liste değiştiği için döngüden çık
                }
            }
        }

        // Eğer liste boşsa tüm parantezler doğru eşleşmiştir
        return characters.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "()[]{}";    // Doğru
        String s2 = "([)]";      // Yanlış
        String s3 = "{[()]}";    // Doğru
        String s4 = "(";         // Yanlış

        System.out.println(isValid(s1)); // true
        System.out.println(isValid(s2)); // false
        System.out.println(isValid(s3)); // true
        System.out.println(isValid(s4)); // false
    }
}
