package com.company.Algorithms;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        for(int index = 1;index<arr.length;index++){
            int j = index;
            while(j>0 && arr[j]<arr[j-1]){
                arr[j-1]+=arr[j];
                arr[j]=arr[j-1]-arr[j];
                arr[j-1]-=arr[j];
                j--;
            }
        }
    }
}
