package com.hillel.reziapov.homeworks.homework13;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        while (head != null) {
            ListNode next = head.getNext();
            head.setNext(previous);
            previous = head;
            head = next;
        }
        return previous;
    }
}
