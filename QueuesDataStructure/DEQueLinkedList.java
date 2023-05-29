package QueuesDataStructure;

public class DEQueLinkedList {
    private Node front;
    private Node rear;
    private int size;

    class Node {
        int element;
        Node next;

        public Node(int e, Node n) {
            element = e;
            next = n;
        }
    }

    public DEQueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int e) {
        Node newest = new Node( e, null);

        if (isEmpty()) {
            front = newest;
            rear = newest;
        } else {
            newest.next = front;
            front = newest;
        }

        size++;
    }

    public void addLast(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            front = newest;
        } else {
            rear.next = newest;
            rear = newest;
        }

        size++;
    }

    public int removeFirst() {
        if (isEmpty())
            return -1;

        int e = front.element;
        if (length() == 1) {
            front = null;
            rear = null;
        } else if (length() > 1) {
            front = front.next;
        }
        size--;
        return e;
    }

    public int removeLast() {
        Node p = front;
        if (isEmpty())
            return -1;

        int count = 1;
        while(count < length() - 1) {
            p = p.next;
        }
        int e = p.next.element;
        p.next = null;
        size--;
        if (isEmpty()) {
            front = null;
            rear = null;
        }

        return e;
    }

    public void display() {
        Node p = front;

        while(p != null)
        {
            System.out.print(p.element + "-->");
            p = p.next;
        }

        System.out.println();
    }

    public int first() {
        if (isEmpty())
            return -1;

        return front.element;
    }

    public int last() {
        if (isEmpty())
            return -1;
        return rear.element;
    }

    public static void main(String[] args) {
        DEQueLinkedList d = new DEQueLinkedList();
        d.addFirst(5);
        d.addFirst(3);
        d.addFirst(7);
        d.addFirst(12);
        d.display();
        System.out.println("Size: " + d.length());
        System.out.println("Front element removed: " + d.removeFirst());
        System.out.println("Rear element removed: " + d.removeFirst());
        d.display();
        System.out.println("Front element removed: " + d.removeFirst());
        System.out.println("Rear element removed: " + d.removeFirst());

    }


}
