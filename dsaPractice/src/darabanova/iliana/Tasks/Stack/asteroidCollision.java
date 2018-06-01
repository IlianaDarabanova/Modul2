package darabanova.iliana.Tasks.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class asteroidCollision {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        int[] numbers =  Arrays.stream(reader.readLine()
                                             .split(", "))
                                             .mapToInt(Integer::parseInt)
                                             .toArray();
        Arrays.stream((asteroidCollision(numbers))).forEach(x-> System.out.printf("%d, ",x));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for (int ast: asteroids) {
            collision: {
                while (!stack.isEmpty() && ast < 0 && 0 < stack.peek()) {
                    if (stack.peek() < -ast) {
                        stack.pop();
                        continue;
                    } else if (stack.peek() == -ast) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(ast);
            }
        }

        int[] ans = new int[stack.size()];
        for (int t = ans.length - 1; t >= 0; --t) {
            ans[t] = stack.pop();
        }
        return ans;
    }
}

