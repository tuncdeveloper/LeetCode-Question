package org.example;

public class Solution {
    public static int smallestNumber(int n, int t) {




        for (int i = n; ; i++) {

            int carpım=1;

            int x=i;
            while (x!=0){
                int kalan = x%10;
                x=x/10;
                carpım = carpım*kalan;
            }

            if (carpım%t == 0) {
                return i;
            }


        }

    }

    public static void main(String[] args) {

        System.out.print(smallestNumber(10,2));
    }

}
