package darabanova.iliana.Tasks.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums1 =Arrays.stream(reader.readLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] nums2 = Arrays.stream(reader.readLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.stream(nextGreaterElement(nums1, nums2)).forEach(x->System.out.printf("%d ",x));

    }


        public static int[] nextGreaterElement(int[] findNums, int[] nums) {
            Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
            Stack<Integer> stack = new Stack<>();
            for (int num : nums) {
                while (!stack.isEmpty() && stack.peek() < num){
                    map.put(stack.pop(), num);}
                stack.push(num);
            }
            for (int i = 0; i < findNums.length; i++)
                findNums[i] = map.getOrDefault(findNums[i], -1);
            return findNums;
        }
    }

