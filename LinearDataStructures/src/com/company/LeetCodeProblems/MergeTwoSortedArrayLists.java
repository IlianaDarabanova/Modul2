package com.company.LeetCodeProblems;

public class MergeTwoSortedArrayLists {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        printNode(l1);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(3);
        printNode(l2);
        System.out.println();
        System.out.println();
        printNode(mergeTwoLists(l1,l2));

    }

      public static class ListNode {
         int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

            ListNode result = new ListNode(-1);
            ListNode node = result;
            while(l1!=null &&l2!=null){
                if(l1.val < l2.val){
                    node.next = new ListNode(l1.val);
                    l1= l1.next;
                }
                else{
                    node.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
               node = node.next;


            }

            while(l2!=null){
                node.next = new ListNode(l2.val);
                l2 = l2.next;
                node = node.next;
            }

            while(l1 != null){
                node.next = new ListNode(l1.val);
                l1 = l1.next;
                node = node.next;
            }
            return  result.next;
        }

        public static void printNode(ListNode a){
        while(a!=null){
            System.out.println(a.val);
            a = a.next;
        }
        }

}
