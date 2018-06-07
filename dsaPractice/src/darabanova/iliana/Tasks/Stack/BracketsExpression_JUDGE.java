package darabanova.iliana.Tasks.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BracketsExpression_JUDGE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String expression = reader.readLine();
        readExp(expression);
    }

    public static void readExp(String exp){
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> expressions = new ArrayList<>();
        for(int i = 0;i<exp.length();i++){
            if(exp.charAt(i)=='('){
                stack.push(i);

            }
            else if(exp.charAt(i) == ')'){
               int firstIndex = stack.pop();
               int lastIndex = i;
               expressions.add(exp.substring(firstIndex,lastIndex+1));

            }



        }

        expressions.forEach(System.out::println);
    }
}
