package CircularLinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int e) {
        Node newest = new Node(e, null);

        if (isEmpty()) {
            head = newest;
        } else {
            tail.next = newest;
        }

        tail = newest;
        tail.next = head;
        size = size + 1;
    }

    public void addFirst(int e) {
        Node newest = new Node(e, null);

        if (isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            newest.next = head;
            head = newest;
        }

        tail.next = head;
        size = size + 1;

    }

    public void insert(int element, int position) {
        if (position < 1 || position >= length()) {
            return;
        }

        Node newest = new Node(element, null);
        Node p = head;
        int i = 1;

        while(i < position - 1) {
            p = p.next;
            i++;
        }

        newest.next = p.next;
        p.next = newest;
        size = size + 1;
    }

    public int removeFirst() {
        int element = -1;
        if (isEmpty()) {
            return element;
        }

        if (length() == 1) {
            element = head.element;
            head = null;
            tail = null;

        } else if (length() > 1) {
            Node temp = head;
            element = temp.element;
            head = head.next;
            temp.next = null;
        }

        size = size - 1;
        return element;
    }

    public int removeLast() {
        int element = -1;
        if (isEmpty())
            return element;

        int i = 1;
        Node p = head;
        while (i < length() - 1) {
            p = p.next;
            i++;
        }

        element = p.next.element;
        tail = p;
        tail.next = head;
        p.next = null;
        size = size -1;
        return element;
    }

    public void display() {
        Node p = head;
        int i = 0;
        while( i < length()){
            System.out.print(p.element + " ==> ");
            p = p.next;
            i++;
        }
        System.out.println();
    }
}
