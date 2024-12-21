package org.example;

public class LinkedListII {



    // NOTES:
    // - search by index -> keep a counter of the current index starting from zero, walk down the list
    //   incrementing the counter for each node when the counter reaches the desired value return that node
    // - searching a linked list takes O(n) time, all you have is a reference of the head of the list
    // - you have to start at the head and look through each subsequent node to get to the end of the
    //   linked list
    // - searching a linked list takes O(n) time

    // - inserting into a linked list requires (1) finding the place to insert the node and (2) rearranging
    //   the surrounding pointers to include it
    // - you don't have to rearrange all the pointers
    // - finding the place to insert the node includes searching through the node
    // - you don't have to rearrange all the elements in a linked list in order to insert the way that
    //   you would an array
    // - once you found the place, it takes O(1) time to insert the node
    // - find the node that you want to insert after
    // - store the value you want to insert into a new ListNode objects ... it's just floating around in
    //   space, it's next pointer is null, it's just hanging out ... we need to change pointers in order
    //   to actually point it to the list
    // - a typical linked list's head is null of the list is empty ... your code won't be able to do next
    //   on null

    // - (1) find the node that's before the node that you want to delete
    // - (2) rearrange the surround pointers to cut out the node to delete
    // - cutting a node out of the lists is an order one O(1) constant time operation
    // - all you have to do is juggle a couple pointers around the node
    // - you don't have to rearrange all the pointers
    // - use chasing pointers to find the node to delete and the node before it
    // - this is kind of the reverse of the insert
    // - deleting a node from the head or the tail ... if the head is null, your delete is going to fail
    // - a typical list's head is null if the list is empty
    // - if deleting the head, the head variable has to be updated
    // - must double-check that special cases can be included in the generic case

}
