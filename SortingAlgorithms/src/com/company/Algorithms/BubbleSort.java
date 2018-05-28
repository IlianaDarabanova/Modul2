package com.company.Algorithms;

public class BubbleSort {
    //TWO FOR-CYCLES VERSION - ASCENDING ORDER - BETTER VERSION~~~!!!
    public static void bubbleSort(int[]arr){

        for(int pass = 1;pass<arr.length;pass++){
            for(int element = 0;element<=arr.length-1-pass;element++){
                if(arr[element]>arr[element+1]){
                    arr[element] +=arr[element+1];
                    arr[element+1]=arr[element]-arr[element+1];
                    arr[element] -=arr[element+1];
                }
            }
        }
    }
    // ONE WHILE-CYCLE && ONE FOR-CYCLE WITH BOOLEAN FOR SWAP DONE VERSION - DESCENDING ORDER
    public static void bubbleSortVersion2(int[] arr){
        boolean is_swap_done = true;

        while(is_swap_done){
            is_swap_done = false;
            for(int element = 0;element<arr.length-1;element++){
                if (arr[element] < arr[element+1]) {
                    arr[element] +=arr[element+1];
                    arr[element+1]=arr[element]-arr[element+1];
                    arr[element] -=arr[element+1];
                    is_swap_done = true;
                }
            }
        }
    }
}
