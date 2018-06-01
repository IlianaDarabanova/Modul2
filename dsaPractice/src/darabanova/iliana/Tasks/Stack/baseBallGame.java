package darabanova.iliana.Tasks.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baseBallGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] types = reader.readLine().split(",");
        int result = recordPoint(types);
        System.out.println(result);

    }

    public static int recordPoint(String[] types){
        Stack<Integer> stack = new Stack<>();
        for(String command : types){
            if(command.equals("+")){
                int top = stack.pop();
                int newTop = top+stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if(command.equals("C")){
                stack.pop();
            }
            else if(command.equals("D")){
                stack.push(stack.peek()*2);
            }
            else{
                stack.push(Integer.parseInt(command));
            }
        }

        int answer = 0;
        for(int i : stack) answer+=i;
        return answer;
    }

}
