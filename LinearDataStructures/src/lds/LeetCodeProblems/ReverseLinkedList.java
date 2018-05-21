package lds.LeetCodeProblems;

public class ReverseLinkedList {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

        public void reverseList(ListNode head) {
          ListNode node = new ListNode(-1);
            ListNode prev = new ListNode(-2);
            ListNode result = node;
            while(head!=null){
                prev = head;
                head = head.next;

            }



            System.out.print(node+" ");
        }

}
