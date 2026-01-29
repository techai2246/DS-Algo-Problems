package com.techai2246.leetcode.easy;

/**
 * ListNode - Utility class representing a node in a singly linked list.
 *
 * Description:
 * This class provides the fundamental building block for linked list implementations.
 * Each node contains an integer value and a reference to the next node.
 *
 * Fields:
 * - val: The integer value stored in this node
 * - next: Reference to the next node in the linked list
 *
 * Constructors:
 * - ListNode(): Default constructor for empty node
 * - ListNode(int val): Constructor with value initialization
 * - ListNode(int val, ListNode next): Constructor with value and next pointer
 *
 * Usage:
 * ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));
 *
 * @author techai2246
 * @version 1.0
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
