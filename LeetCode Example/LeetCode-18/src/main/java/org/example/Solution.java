package org.example;
import java.math.BigInteger;

class Solution {
    public static String multiply(String num1, String num2) {
        // String num1 ve num2'yi BigInteger türüne dönüştür
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        // Çarpma işlemi yap
        BigInteger result = a.multiply(b);

        // Sonucu String olarak döndür
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));  // Örneğin: "56088"
    }
}

