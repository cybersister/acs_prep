package org.example;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.example();

        System.out.println(linkedList.sampleProblem1(1, 2, 3));
        // 1

        ListNode<Integer> previous = new ListNode<Integer>(1);
        ListNode<Integer> current = new ListNode<Integer>(2);
        ListNode<Integer> after = new ListNode<Integer>(3);

        previous.next = current;
        current.next = after;
        after.next = null;

        int value = 99;
        int index = 0;
        int otherIndex = 3;
        int anotherIndex = 1;
        int lastIndex = 2;

        LinkedListII linkedListII = new LinkedListII();
        System.out.println(linkedListII.solution(previous, value, index));
        System.out.println(linkedListII.solution(previous, value, otherIndex));
        System.out.println(linkedListII.solution(previous, value, anotherIndex));
        System.out.println(linkedListII.solution(previous, value, lastIndex));
        // 2 (run the print statements separately)

    }

}