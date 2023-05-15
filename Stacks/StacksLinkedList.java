package Stacks;

import LinkedListPractice2.Node;

public class StacksLinkedList {

    private class Node {
        public int element;
        public Node next;

        public Node(int e, Node n) {
            element = e;
            next = n;
        }
    }
    public int size;
    public Node top;

    public StacksLinkedList() {
        size = 0;
        top = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public int peek() {
        if (isEmpty())
            return -1;
        return top.element;
    }

    public void push(int value) {
        Node newest = new Node(value, null);
        if (isEmpty()) {
            top = newest;
        } else {
            newest.next = top;
            top = newest;
        }
        size++;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int element = top.element;
        top = top.next;
        size--;
        return element;
    }

    public void display() {
        Node p = top;
        while(p != null) {
            System.out.print(p.element + "--");
            p = p.next;
        }

        System.out.println();
    }

}
