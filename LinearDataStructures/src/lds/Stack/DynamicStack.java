package lds.Stack;

import lds.Queue.Node;

import java.util.EmptyStackException;

public class DynamicStack {
    private Node top;

    public DynamicStack(){
        top = null;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void push(int x ){

        Node newElement = new Node(x);
        newElement.next =  top;
        top = newElement;


    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

            int value = top.value;
            top = top.next;
            return value;


    }

    public int peek(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        return top.value;
    }
}
