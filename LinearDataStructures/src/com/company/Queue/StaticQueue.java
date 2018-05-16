package com.company.Queue;

import java.util.Arrays;

public class StaticQueue {
    int[] data;
    int tail;
    int head;

    public StaticQueue(){
        data = new int[5];
        head = tail = -1;

    }

    public boolean isEmpty(){
       return tail == -1;
    }

    public void enqueue(int x){
        if(isEmpty()){
            head++;
            data[head] = x;

        }
        tail++;

        if(tail ==data.length){
            resizeData();
        }
        data[tail] = x;
    }

    private void resizeData() {
        data = Arrays.copyOf(data, data.length*2);
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {

            throw new Exception("Empty queue");
        }
        if(head==tail){
            return data[head];
        }
        else{
        return data[head++];}

    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw  new Exception("Empty queue");
        }
        return data[head];
    }
}
