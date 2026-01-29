package com.techai2246.leetcode.easy;

/**
 * DeleteDuplicateNode - Removes consecutive duplicate nodes from a sorted linked list.
 *
 * Problem Description:
 * Given the head of a sorted linked list, delete all duplicates such that
 * each element appears only once. Return the linked list sorted as well.
 *
 * Example:
 * Input: 1→1→1
 * Output: 1
 *
 * Algorithm:
 * - Traverse the linked list with previous and current pointers
 * - Compare values of consecutive nodes
 * - Skip duplicate nodes by updating next pointers
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(1) - in-place modification
 *
 * @author techai2246
 * @version 1.0
 */
public class DeleteDuplicateNode {
    /**
     * Removes consecutive duplicate nodes from a sorted linked list.
     *
     * @param head head of the sorted linked list
     * @return head of the list with duplicates removed
     */
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
