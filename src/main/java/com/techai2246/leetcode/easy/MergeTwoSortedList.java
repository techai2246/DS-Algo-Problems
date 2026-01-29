package com.techai2246.leetcode.easy;

/**
 * MergeTwoSortedList - Merges two sorted linked lists into a single sorted list.
 *
 * Problem Description:
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing
 * together the nodes of the two lists.
 * Return the head of the merged linked list.
 *
 * Example:
 * List1: 1→2→4
 * List2: 1→3→4
 * Output: 1→1→2→3→4→4
 *
 * Algorithm:
 * - Traverse both lists simultaneously using two pointers
 * - Compare node values and link the smaller value
 * - Append remaining nodes from the non-empty list
 *
 * Time Complexity: O(n + m) where n, m are list sizes
 * Space Complexity: O(n + m) for new merged list
 *
 * @author techai2246
 * @version 1.0
 */
public class MergeTwoSortedList {
    /**
     * Merges two sorted linked lists into a single sorted list.
     *
     * @param list1 head of the first sorted linked list
     * @param list2 head of the second sorted linked list
     * @return head of the merged sorted linked list
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        boolean isFirstElement = true;
        ListNode head = null;
        ListNode previousNode = null;

        while (list1 != null && list2 != null) {
            ListNode node;
            if (list1.val <= list2.val) {
                node = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                node = new ListNode(list2.val);
                list2 = list2.next;
            }
            if (isFirstElement) {
                head = node;
                previousNode = node;
                isFirstElement = false;
            } else {
                previousNode.next = node;
                previousNode = node;
            }
        }
        while (list1 != null) {
            ListNode node = new ListNode(list1.val);
            if (head == null) {
                head = node;
                previousNode = node;
            } else {
                previousNode.next = node;
                previousNode = node;
            }
            list1 = list1.next;
        }
        while (list2 != null) {
            ListNode node = new ListNode(list2.val);
            if (head == null) {
                head = node;
                previousNode = node;
            } else {
                previousNode.next = node;
                previousNode = node;
            }
            list2 = list2.next;
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode mergedList = mergeTwoSortedList.mergeTwoLists(list1, list2);
        System.out.print("Merged Sorted List: ");
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }

}
