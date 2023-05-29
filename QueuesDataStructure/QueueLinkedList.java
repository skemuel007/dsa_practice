package QueuesDataStructure;

public class QueueLinkedList {

    class Node {
        int element;
        Node next;

        public Node(int e, Node n) {
            element = e;
            next = n;
        }
    }

    Node front;
    Node rear;
    int size;

    public QueueLinkedList() {
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

    public void enqueue(int e) {
        Node newest = new Node(e, null);
        if (isEmpty())
        {
            front = newest;
        } else {
            rear.next = newest;
        }

        rear = newest;
        size++;

    }

    public int dequeue() {
        if (isEmpty())
            return -1;
        int element = front.element;
        if (length() == 1)
        {
            front = null;
            rear = null;
        } else if (length() > 1) {
            front = front.next;
        }
        size--;
        return element;
    }

    public int front() {
        if(isEmpty())
            return -1;
        return front.element;
    }

    public int rear() {
        if(isEmpty())
            return -1;
        return rear.element;
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

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(5);
        q.enqueue(3);
        q.display();
        System.out.println("Size: " + q.length());
        System.out.println("Element removed: " + q.dequeue());
        System.out.println("IsEmpty: " + q.isEmpty());
        System.out.println("Element removed: " + q.dequeue());
        System.out.println("IsEmpty: " + q.isEmpty());
        q.enqueue(7);
        q.enqueue(9);
        q.enqueue(4);
        q.display();
        System.out.println("Size: " + q.length());

    }
}
