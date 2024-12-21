package org.example;

public class IntroductionRecursion {

    public IntroductionRecursion() {}

    /**
     * Linearly searches a LinkedList recursively.
     */
    public boolean solution(ListNode<Integer> head, int value) {
        if (head == null) {
            return false;
        }
        // empty list

        if (head.value == value) {
            return true;
        }

        return solution(head.next, value);
        // applies to all the nodes in the list except for the first one
        // recursive
    }


//************************************************************************************************************

    // NOTES:
    // - recursion in a nutshell is a function calling itself to get work done
    // - you have to be able to define the problem recursively, using itself in its own definition
    // - identify that the problem is made up of identically defined, smaller sub-problems
    // - you can always use recursion or iteration to solve a problem
    // - but lots of times with self-similar data structures, the recursive solution is more elegant
    // - just because we can use recursion doesn't mean we always should ... keep it simple stupid
    // - we can replace a loop using recursion
    // - don't print recursive calls in your head ... just make sense of the recursive portion
    // - we should stop at the base case
    // - it's like the recursive implementation get "stuck in a whole" ... alice and wonderland style
    // - this would be great to practice with actual math problems and shit

}
