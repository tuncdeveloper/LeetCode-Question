package org.example;

import java.util.LinkedList;

public class Main {

    public static int smallestNumber(int n) {

        LinkedList<Integer>list = new LinkedList<>();
        
        do {
            int kalan = n % 2;
            list.addLast(kalan); // Binary soldan sağa yazılacağı için başa eklenir
            n = n / 2;
        } while (n != 0);



            if (list.get(0) == 1) {
                for (int i = 1; i < list.size()+1; i++) {
                    if (list.get(i)== 0) {
                        list.set(i,1);
                    }

                }
            }else {
                for (int i = 0; i < list.size(); i++) {

                    list.set(i,1);

                    }
            }

            StringBuilder stringBuilder = new StringBuilder();

        for (Integer bir : list) {
                stringBuilder.append(bir);
        }
            int x = Integer.parseInt(stringBuilder.toString());
        

        return x;
    }

    public static void main(String[] args) {

        System.out.println(smallestNumber(8));
    }
}