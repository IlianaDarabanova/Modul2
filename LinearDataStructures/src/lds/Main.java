package lds;

import lds.Queue.StaticQueue;
import lds.Queue.DynamicQueue;
import lds.Stack.DynamicStack;
import lds.Stack.StaticStack;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) throws Exception {
        //Creating static stack
    StaticStack s = new StaticStack();
    s.push(1);
    s.push(2);
    s.push(3);


    s.pop();
    s.push(4);
    s.push(5);

    while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
    }
        System.out.println();

    // creating dynamic queue
    DynamicQueue q = new DynamicQueue();
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.dequeue();
    while(!q.isEmpty()){
        System.out.print(q.dequeue()+" ");
    }
        System.out.println();


    //creating static queue
        System.out.println(".::STATIC QUEUE::.");
    StaticQueue sQ = new StaticQueue();
    try {
        sQ.peek();
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }
    sQ.enqueue(10);
    sQ.enqueue(9);
    sQ.dequeue();
    sQ.dequeue();
    sQ.enqueue(9);
    sQ.enqueue(8);
    sQ.enqueue(7);
    sQ.dequeue();
    sQ.dequeue();
    while(!sQ.isEmpty()){
        System.out.println(sQ.dequeue());
    }


    //Creating dynamic Stack

        DynamicStack ds = new DynamicStack();
        System.out.println(ds.isEmpty());
        try{
            ds.pop();

        }catch (EmptyStackException e){
            System.out.println("Empty Stack!");
        }
        ds.push(1);
        ds.push(2);
        ds.push(3);
        ds.push(4);
        System.out.println(ds.peek());
        ds.pop();
        System.out.println();
        while (!ds.isEmpty()){
            System.out.println(ds.pop());
        }

    }
}