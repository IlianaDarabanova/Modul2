package com.company.Algorithms;

public class MergeSort {
    public static void mergeSort(int[] array, int begin, int end,int[] temp) {

        if (begin == end-1) {
            return;
        }

            int middle = (begin+end)/2;
            mergeSort(array,begin, middle,temp);
            mergeSort(array,middle, end,temp);
            mergeParts(array,temp,begin, middle, end);
        }


    private static void mergeParts(int[] temp, int[] array,int lowerIndex, int middle, int higherIndex) {


    }
}
