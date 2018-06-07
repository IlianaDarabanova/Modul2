package darabanova.iliana.Tasks.dsaExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class HDNL {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String[] combinations = new String[num];
        for (int i = 0; i < num; i++) {
            combinations[i] = reader.readLine();
        }

        printHDNL(combinations);
    }

    private static void printHDNL(String[] combinations) {
        Stack<String> stack = new Stack<>();
        int number = Integer.parseInt(combinations[0].substring(1));
        stack.push(combinations[0]);
        System.out.printf("<%s>\n",combinations[0]);
        for(int i = 1;i<combinations.length;i++){
               while (!stack.isEmpty() && Integer.parseInt(combinations[i].substring(1))<=Integer.parseInt(stack.peek().substring(1))){
                      System.out.printf("%s</%s>\n",new String(new char[stack.size()]).replace("\0", " "),stack.pop());

                }


           stack.push(combinations[i]);
            System.out.printf("%s<%s>\n",new String(new char[stack.size()]).replace("\0", " "),combinations[i]);


        }
        while(!stack.isEmpty()) {
            System.out.printf("%s</%s>\n",new String(new char[stack.size()]).replace("\0", " "), stack.pop());
        }
    }

}
