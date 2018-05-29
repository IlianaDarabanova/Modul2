package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = {1,2,3,4,5,6,7,8,10,15,25};
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
        System.out.println("\nWhich number do you search for? ");
        int key = Integer.parseInt(reader.readLine());
        int position = BinarySearch.binarySearch(arr,key,0,arr.length-1);
        if(position==-1){
            System.out.println("There is no "+key+" in this array");
        }
        else {
            System.out.println(key + " is found at position " + position);
        }
    }
}
