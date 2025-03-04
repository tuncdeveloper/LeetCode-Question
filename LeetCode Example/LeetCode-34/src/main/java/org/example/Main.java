package org.example;

public class Main {
    public static void main(String[] args) {


        int n = 38 ;
        System.out.println(addDigits(n));

    }


    public static int addDigits(int n){


        int top =0;
        int basamak=0;


    do {
        top=0;
        while (n > 0) {
            basamak = n % 10;
            top = top + basamak;
           n = n / 10;
        }
        n=top;

    }while (top>=10);

        return top;
    }



}