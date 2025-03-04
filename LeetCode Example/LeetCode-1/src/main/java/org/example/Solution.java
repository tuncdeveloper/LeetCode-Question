package org.example;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {

        int [] dizi = new int[2];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {

                sum = nums[i]+nums[j];
                if (sum == target) {

                    dizi[0]=i;
                    dizi[1]=j;

                    return dizi;

                }
            }
        }


        return new int[0];
    }


    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;



       try {
           int[] dizi = twoSum(nums, target);


           System.out.print("[");
           for (int i = 0; i < dizi.length; i++) {

               if (i == dizi.length-1) {
                   System.out.print(dizi[i] + "]");
                   return;
               } else {
                   System.out.print(dizi[i] + ",");
               }

           }
       }catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Hata: Dizinin boyutunu aştınız! Hatalı erişim: " + e.getMessage());
       } catch (Exception e) {
           System.out.println("Bilinmeyen bir hata oluştu: " + e.getMessage());
       }
    }





}
