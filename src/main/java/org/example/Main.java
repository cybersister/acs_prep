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
        // 2 (run the print statements one at a time ... they fork each other up)

        StacksAndQueues stacksAndQueues = new StacksAndQueues();

        String sequence1 = "()";
        System.out.println("Sequence One: " + stacksAndQueues.stackSolution(sequence1));
        System.out.println("Sequence One: " + stacksAndQueues.characterStackSolution(sequence1));

        String sequence2 = "()[]{}";
        System.out.println("Sequence Two: " + stacksAndQueues.stackSolution(sequence2));
        System.out.println("Sequence Two: " + stacksAndQueues.characterStackSolution(sequence2));

        String sequence3 = "(]";
        System.out.println("Sequence Three: " + stacksAndQueues.stackSolution(sequence3));
        System.out.println("Sequence Three: " + stacksAndQueues.characterStackSolution(sequence3));

        String sequence4 = "([)]";
        System.out.println("Sequence Four: " + stacksAndQueues.stackSolution(sequence4));
        System.out.println("Sequence Four: " + stacksAndQueues.characterStackSolution(sequence4));

        String sequence5 = "{[]}";
        System.out.println("Sequence Five: " + stacksAndQueues.stackSolution(sequence5));
        System.out.println("Sequence Five: " + stacksAndQueues.characterStackSolution(sequence5));

        String sequence6 = "{";
        System.out.println("Sequence Six: " + stacksAndQueues.stackSolution(sequence6));
        System.out.println("Sequence Six: " + stacksAndQueues.characterStackSolution(sequence6));

        String sequence7 = "][";
        System.out.println("Sequence Seven: " + stacksAndQueues.stackSolution(sequence7));
        System.out.println("Sequence Seven: " + stacksAndQueues.characterStackSolution(sequence7));

        String sequence8 = "";
        System.out.println("Sequence Eight: " + stacksAndQueues.stackSolution(sequence8));
        System.out.println("Sequence Eight: " + stacksAndQueues.characterStackSolution(sequence8));

        String sequence9 = "[][{](})";
        System.out.println("Sequence Nine: " + stacksAndQueues.stackSolution(sequence9));
        System.out.println("Sequence Nine: " + stacksAndQueues.characterStackSolution(sequence9));

        String sequence10 = "[[(({()}))]]{()}[({})]";
        System.out.println("Sequence Ten: " + stacksAndQueues.stackSolution(sequence10));
        System.out.println("Sequence Ten: " + stacksAndQueues.characterStackSolution(sequence10));
        // 3



    }

}