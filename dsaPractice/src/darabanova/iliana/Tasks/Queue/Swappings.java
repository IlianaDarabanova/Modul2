package darabanova.iliana.Tasks.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Swappings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
                int[] keys = Arrays.stream(reader.readLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        swapNumbers(n,keys);
    }

    private static void swapNumbers(int n, int[] keys) {
        Queue<Integer> nums = new LinkedList<Integer>();
        for(int i = 1;i<=n;i++){
            nums.offer(i);
        }
        
        for(int i = 0;i<keys.length;i++){
            int keyNumber = keys[i];
            nums.offer(keyNumber);
            int first = nums.peek();
            while(first!=keyNumber){
                nums.offer(first);
                nums.poll();
                first = nums.peek();
                
            }
            nums.poll();
        }
        
        printQueue(nums);





    }

    private static void printQueue(Queue<Integer> nums) {
        while(!nums.isEmpty()){
            int number = nums.poll();
            System.out.printf("%d ",number);
        }
    }
}
