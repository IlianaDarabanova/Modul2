package lds.LeetCodeProblems;


public class RemoveDuplicatesFromSortedList {

        public static void main(String[] args){
            ListNode a = new ListNode(1);
            a.next = new ListNode(1);
            a.next.next = new ListNode(2);
            printNode(a);
            System.out.println();
            printNode(deleteDuplicates(a));
        }

      public static class ListNode {
          int val;
          ListNode next;
         ListNode(int x) { val = x; }
     }

        public static ListNode deleteDuplicates(ListNode head) {
            ListNode result = new ListNode(-1);
            ListNode node = result;

            while(head!=null){

                if(head.next == head){
                    continue;
                }
                node.next = head;
                node = node.next;
            }
            return result;
        }

        public static void printNode(ListNode a){
          while(a!=null){
              System.out.print(a.val+" ");
              a = a.next;
          }
        }

}
