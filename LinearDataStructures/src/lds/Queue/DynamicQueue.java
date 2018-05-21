package lds.Queue;

public class DynamicQueue {

    private Node head, tail;
    public DynamicQueue(){
        head = tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(int x){

        Node newElement = new Node(x);
        if(isEmpty()){
            tail = head = newElement;
        }
        else {
            tail.next = newElement;
            tail = newElement;
       }
    }

    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty.");
        }
        int result = head.value;
        head = head.next;
        if(head==null) {
            tail = null;
        }
        return result;

    }

    public void peek()throws  Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty.");
        }
        else{
            System.out.println(head.value);
        }
    }
}
