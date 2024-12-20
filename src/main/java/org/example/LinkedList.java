package org.example;

import java.util.List;

public class LinkedList {

    class ListNode<T> {
        T value;
        ListNode<T> next;
        // reference to an object

        ListNode(T value) {
            this.value = value;
        }

        public String toString() {
            return "ListNode:" + this.value + " -> " + this.next;
        }
    }

    ListNode<Integer> a = new ListNode<Integer>(1);
    ListNode<Integer> b = new ListNode<Integer>(2);
    ListNode<Integer> c = new ListNode<Integer>(3);

    public void example() {
        a.next = b;
        b.next = c;

        System.out.println(a);
    }

    public ListNode<Integer> sampleProblem1(int a, int b, int c) {
        // create new ListNodes for a, b, and c
        //  pass the values a, b, and c into the constructor
        // connect the next pointers
        //  aNode's next should point to bNode and bNode's should point to cNode
        // return the head of the list (aNode)
        // round 1 plan

        int nums[] = {a, b, c};
        // making this problem more generic at this point, round 1 reflect

        ListNode<Integer> head = null;
        ListNode<Integer> tail = null;

        for (int n : nums) {
            ListNode<Integer> newNode = new ListNode<Integer>(n);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
                // the tail keeps moving to the next node ... lol
            }
        }

        return head;
        // now it's been generalized quite a bit <3

//        ListNode<Integer> aNode = new ListNode<Integer>(a);
//        ListNode<Integer> bNode = new ListNode<Integer>(b);
//        ListNode<Integer> cNode = new ListNode<Integer>(c);
//
//        aNode.next = bNode;
//        bNode.next = cNode;

//        return aNode;
        // round 1 execute
    }

    // NOTES:
    // - a data structure that is connected nodes ... subway train, car connected to the next
    // - only point at the head (first node) and the tail (last node)
    // - every node has a reference to the next node
    // - a node includes the information/object as well as a pointer
    // - benefits -> can easily insert and remove nodes without shifting, with arrays you have to shift
    // - drawbacks -> can't randomly access, you have to start at the head of the list to access a
    //   random element, have to walk down the list to find the node you're interested in
    // - each node has a value as well as a reference to the next node (a pointer)

}
