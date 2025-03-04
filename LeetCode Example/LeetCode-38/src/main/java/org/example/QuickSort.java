package org.example;

public class QuickSort {

    public static void main(String[] args) {

        int [] nums = {4,2,3,8,5};

        quickSort(nums,0,nums.length-1);

    }

    private static void quickSort(int[] nums, int start, int end) {

        if (start >= end) {
            return;
        }

        int pivot = partition(nums,start,end);
        quickSort(nums,start,pivot-1);
        quickSort(nums,pivot+1,end);
    }

    private static int partition(int[] nums, int start, int end) {

        int pivot = nums[end];
        int i=start-1;

        for (int j = start; j < end; j++) {

            if (pivot > nums[j]) {
                i++;
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }

        }

    }


}
