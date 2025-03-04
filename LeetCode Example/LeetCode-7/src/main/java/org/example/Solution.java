package org.example;

class Solution {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "''";  // Eğer dizi boşsa, boş bir string döndür.
        }

        String firstWord = strs[0];  // İlk kelimeyi alıyoruz.
        StringBuilder ortakPrefix = new StringBuilder();  // Ortak ön ek karakterlerini tutacak StringBuilder.


        for (int i = 0; i < firstWord.length(); i++) {
            char currentChar = firstWord.charAt(i);  // İlk kelimenin her karakterini alıyoruz.

            // Diğer kelimelerde de bu karakter var mı diye kontrol ediyoruz
            for (String word : strs) {
                if (i >= word.length() || word.charAt(i) != currentChar) {
                    return ortakPrefix.toString() ;
                }
            }

            // Eğer bu karakter tüm kelimelerde ortak ise, onu StringBuilder'a ekliyoruz
            ortakPrefix.append(currentChar);
        }

        // Ortak ön ek tamamlandığında parantez içinde döndürüyoruz
        return  ortakPrefix.toString() ;
    }

    public static void main(String[] args) {
        String[] string = {"banana", "band", "ban", "bat"};
        System.out.println(longestCommonPrefix(string));  // Çıktı: (ba)
    }
}
