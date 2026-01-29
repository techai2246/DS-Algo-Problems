package com.techai2246.leetcode.easy;

public class DeleteDuplicateNode {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode previous = null;
        ListNode result = head;
        while (head != null) {
            if(previous == null){
                previous = head;
                head = head.next;
                continue;
            }
            if (previous.val == head.val) {
                previous.next = head.next;
                head = head.next;
            } else{
                previous = head;
                head = head.next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(1)));
        DeleteDuplicateNode deleteDuplicateNode = new DeleteDuplicateNode();
        ListNode updatedList = deleteDuplicateNode.deleteDuplicates(list1);
        System.out.print("List after removing duplicates: ");
        while (updatedList != null) {
            System.out.print(updatedList.val + " ");
            updatedList = updatedList.next;
        }
    }
}
