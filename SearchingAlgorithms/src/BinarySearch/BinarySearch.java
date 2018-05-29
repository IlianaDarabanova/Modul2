package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key, int from, int to){
        if (to<from){
                return -1;}

                int middle = (to+from)/2;
        if(arr[middle]==key){
            return middle;
        }
        else if(arr[middle]<key){
            return binarySearch(arr,key,middle+1,to);
        }
        else {
            return binarySearch(arr,key,from,middle-1);
        }
    }
}
