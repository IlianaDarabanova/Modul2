package sortAlg;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        for(int pass = 0; pass< arr.length-1;pass++){
            int best_position = pass;
            for(int element = pass+1;element<arr.length;element++){
                if(arr[element]<arr[best_position]){
                    best_position = element;
                }
            }
            if(best_position!=pass){
                arr[pass] +=arr[best_position];
                arr[best_position]=arr[pass]-arr[best_position];
                arr[pass]-=arr[best_position];
            }

        }
    }
}
