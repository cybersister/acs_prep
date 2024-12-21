package org.example;

public class QueueBasics {



    // NOTES:
    // - similar to stacks, you can implement with any concrete data type you want
    // - it has to support two main queue operations, enqueue() and dequeue()
    // - enqueue() -> put something at the end of the queue
    // - dequeue() -> remove something from the front of the queue
    // - these are useful (1) anytime you want to track things to do later in (2) the least recent order
    // - this is a first-in, first-out data structure
    // - implemented as an array -> delete from the head is O(n), insert at the tail is O(1), delete from
    //   the tail O(1), and inserting at the head is O(n)
    // - implemented as a linked list -> delete from the head is O(1), inserting from the tail is O(1)*,
    //   delete from the tail is O(n), and insert at the head is O(1) (*insert at a tail is only O(1) if
    //   you're maintaining a tail pointer)
    // - the "head" of the linked list is the "back" of the queue, whatever is making these data
    //   operations make the most sense

}
