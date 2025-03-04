package org.example;

public class Main {
    public static void main(String[] args) {

        int [] arr = {4,6,2,3};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

                                                    // 4  6  2   3        i = 1 , j=0 , key = 6

                                                    // 4  6  2   3        i = 2 , J=1 , key =  2

                                                    // 4  6  6   3        i = 2 , j=0 , key = 2

                                                    // 2  4  6   3         i=3  , j= 2  key = 3

                                                    // 2  4  6   6          i=3 , j = 1 key = 3

                                                    // 2  4  4   6          i=3 , j = 0 key = 3

                                                    // 2  3  4   6
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }


        for (int d : arr) {
            System.out.println(d);
        }
    }
}