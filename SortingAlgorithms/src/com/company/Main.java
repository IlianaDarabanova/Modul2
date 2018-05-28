package com.company;

import com.company.Algorithms.BubbleSort;
import com.company.Algorithms.CountingSort;
import com.company.Algorithms.InsertionSort;
import com.company.Algorithms.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, 4, 5, 4, 2, 3, 6, 9, 8, 7, 5, 6, 8, 4, 7, 4, 5, 70, 41, 56, 21, 33};
        Arrays.stream(array).forEach(x->System.out.print(x+" "));

//        System.out.println("\nBubble sort:");
//        BubbleSort.bubbleSort(array);
//
//        System.out.println("\nSelection sort:");
//        SelectionSort.selectionSort(array);

//        System.out.println("\nInsertion sort:");
//        InsertionSort.insertionSort(array);
//
        // Arrays.stream(array).forEach(x->System.out.print(x+" "));
//        System.out.println();


        System.out.println("\nCounting sort:");
        Arrays.stream(CountingSort.CountingSort(array)).forEach(x->System.out.print((x+" ")));



     }
}
