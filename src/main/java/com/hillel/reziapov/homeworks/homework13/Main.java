package com.hillel.reziapov.homeworks.homework13;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] firstExample = {7, 1, 5, 3, 6, 4};
        int[] secondExample = {7, 6, 4, 3, 1};
        List<Integer> name = new LinkedList<>();

        Profit.maxProfit(firstExample);
        Profit.maxProfit(secondExample);


        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        node0.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        Solution solution = new Solution();
        ListNode newHead = solution.reverseList(node0);
        while (newHead != null) {
            System.out.print(newHead.getValue() + " ");
            newHead = newHead.getNext();
        }


    }

}

