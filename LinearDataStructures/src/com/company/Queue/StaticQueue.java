package com.company.Queue;

import java.util.Arrays;

public class StaticQueue {
  int[] data;
  int head;
  int tail;

  public StaticQueue(){
      data = new int[10];
      head=tail=-1;
  }

    public boolean isEmpty(){
      if(head==tail && head ==-1){
          return true;
      }
      if (head>tail){
          head--;
          return true;
      }
      else return false;
    }

    public void enqueue(int x){

      if(isEmpty()){
          head++;
          data[head] = x;

      }
        tail++;
      if(tail>= data.length-1){
          resizeData();
          data[tail]=x;

      }
      else{
          data[tail] = x;
      }

    }

    public int dequeue() throws Exception {

      if(isEmpty()){
          System.out.println("The queue is empty");
          throw new Exception("Empty queue!");
      }
      else{
          return data[head++];

      }
    }

    private void resizeData() {
       data = Arrays.copyOf(data, data.length*2);;
    }

    public int peek() throws Exception {
      if(isEmpty()){
          throw new Exception( "Empty queue!");
      }
      else{
          return data[head];
      }
    }
}
