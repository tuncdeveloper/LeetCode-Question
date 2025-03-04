package org.example;

public class MergeSort {


    public static void mergeSort(int [] array){

        if (array.length < 2) {
            return;
        }

        int middle = array.length/2;

        int [] left = new int[middle];
        int [] right = new int[array.length-middle];

        int i =0, j=0 ;

        for (int k=0 ; k < array.length; k++) {

            if (k < middle) {
                left[i]=array[k];
                i++;
            }else {
                right[j]=array[k];
                j++;
            }

        }

        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);

    }

    public static void merge(int [] left , int [] right , int [] array){

        int i=0,j=0,k=0;

        while (i<left.length && j< right.length){

            if (left[i]<right[j]) {

                array[k]=left[i];
                k++;
                i++;
            }else {
                array[k]=right[j];
                k++;
                j++;
            }
        }


        while (i<left.length){
            array[k++]=left[i++];
        }

        while (j<right.length){
            array[k++] = right[j++];
        }

    }


    public static void main(String[] args) {
        int [] dizi = {2,1,3,9,6,4};

        mergeSort(dizi);

        System.out.println("\n\nDizinin sıralandıktan sonraki hali:");
        for (int num : dizi) {
            System.out.print(num + " ");
        }
    }



}
