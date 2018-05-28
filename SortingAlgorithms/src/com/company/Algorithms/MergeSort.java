package com.company.Algorithms;

public class MergeSort {

    public static void mergeSort(int[] array, int begin, int end){
        if(begin<end){
            int middle = (begin+end)/2;
            mergeSort(array,begin,middle);
            mergeSort(array,middle,end);
            mergeTwoSortedArrays(array,begin,middle,middle+1,end);
        }
    }

    private static void mergeTwoSortedArrays(int[] array, int begin, int middle, int i, int end) {
    }
}
