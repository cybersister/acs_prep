package org.example;

public class StackBasics {



    // NOTES:
    // - stacks are an abstract data type ... you can implement with any concrete data type you want
    // - the main thing is that it has to support the two main stack operations ... push() and pop()
    // - push() -> putting something on top of the stack, not allowed to put plates in the middle or
    //   bottom of the stack
    // - pop() -> remove something from the top of the stack, not allowed to remove plates in the middle
    //   or bottom of the stack
    // - useful (1) anytime you want to track things to do later in (2) the most recent order
    // - last-in, first-out data structure
    // - we have options to use arrays as stacks ... should we use an array or linked list to implement?
    // - array -> delete from the head (bottom of the stack) is O(n), inserting at the head is O(n),
    // - deleting from the tail (top of the stack) is O(1), inserting at the tail is O(1)
    // - linked list -> deleting from the head is O(1), inserting at the head is O(1), deleting from the
    //   tail is O(n), and inserting at the tail is O(1)* (*insert at the tail only if you're maintaining
    //   a tail pointer) ... the head of the list is the smarter way to go

    // when we say that stacks are an abstract data type, it means that a stack is defined by its
    //  behavior (the operations it supports) rather than by its implementation ... an adt specifies what
    //  operations can be performed on the data and what the expected behavior of these operations is
    //  without specifying how these operations are implemented
    // the choice of implementation can affect the performance characters of the stack operations

}
