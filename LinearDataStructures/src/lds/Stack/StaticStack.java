package lds.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StaticStack {
    int[] data;
    int top;

    public StaticStack(){
        data = new int[10];
        top = -1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void push(int x){
        top++;
        if(top==data.length){
            resizeData();
        }
        data[top] = x;

    }

    public int pop(){
        if (isEmpty()) {

           throw new EmptyStackException();
        }
        return data[top--];
    }

    public int peek(){
        if(top==-1){
            throw  new EmptyStackException();
        }
        return data[top];
    }
    private void resizeData() {
        data = Arrays.copyOf(data, data.length*2);
    }
}
