package com.company.Algorithms;

import java.util.Arrays;

public class CountingSort {

    public static int[] countingSort(int[] unsorted){

        int[] sorted = new int[unsorted.length];

        int max = Arrays.stream(unsorted).max().getAsInt();

        int[] indices = new int[max+1];

        for(int i = 0;i<unsorted.length;i++){
            int currentNumber = unsorted[i];
            indices[currentNumber]++;

        }

        for(int i = 1;i<indices.length;i++){
            indices[i]+=indices[i-1];
        }

        for(int i = 0;i<unsorted.length;i++){
            int currentNumber = unsorted[i];
            int position = --indices[currentNumber];
            sorted[position]=currentNumber;
        }


        return  sorted;
    }
}
