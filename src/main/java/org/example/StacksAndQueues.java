package org.example;

import java.util.List;
import java.util.Stack;

public class StacksAndQueues {

    class StackListNode<T> {
        public final T value;
        public StackListNode<T> next;

        public StackListNode(T value) {
            this.value = value;
        }
    }

    class CharacterStack {
        private StackListNode<Character> head = null;

        public CharacterStack() {}

        public void push(Character value) {
            StackListNode<Character> newNode = new StackListNode<Character>(value);

            newNode.next = head;
            head = newNode;
        }

        public Character pop() {
            if (head == null) {
                return null;
            }

            Character value = head.value;
            head = head.next;

            return value;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

    public StacksAndQueues() {}

    public boolean stackSolution(String sequence) {
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;

        for (int i = 0; i < sequence.length(); i++) {
            char first = sequence.charAt(i);
            char second;

            if ("[({".indexOf(first) != -1) {
                stack.push(first);
            } else if ("])}".indexOf(first) != -1) {
                if (stack.isEmpty()) {
                    return false;
                }

                second = stack.pop();
                switch(second) {
                    case '[':
                        isBalanced = (first == ']');
                        break;
                    case '{':
                        isBalanced = (first == '}');
                        break;
                    case '(':
                        isBalanced = (first == ')');
                        break;
                    default:
                        isBalanced = false;
                }
            }
        }

        return isBalanced && stack.isEmpty();
        // isEmpty() to ensure we go through the entire sequence of characters
    }

    public boolean characterStackSolution(String sequence) {
        CharacterStack stack = new CharacterStack();
        boolean isBalanced = true;

        for (int i = 0; i < sequence.length(); i++) {
            char first = sequence.charAt(i);
            char second;

            if ("[({".indexOf(first) != -1) {
                stack.push(first);
            } else if ("])}".indexOf(first) != -1) {
                if (stack.isEmpty()) {
                    return false;
                }

                second = stack.pop();
                switch(second) {
                    case '[':
                        isBalanced = (first == ']');
                        break;
                    case '{':
                        isBalanced = (first == '}');
                        break;
                    case '(':
                        isBalanced = (first == ')');
                        break;
                    default:
                        isBalanced = false;
                }
            }
        }

        return isBalanced && stack.isEmpty();
        // isEmpty() to ensure we go through the entire sequence of characters
    }

}
