package com.techai2246.leetcode.easy;

public class MergeTwoSortedList {
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
