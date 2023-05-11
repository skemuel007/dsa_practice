package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public void addLast(int element) {
        Node newest = new Node(element, null, null);
        if (isEmpty())
        {
            head = newest;
            tail = newest;
        } else {
            // Node p = tail;
            tail.next = newest;
            newest.prev = tail;
            tail = newest;
        }

        size = size + 1;
    }

    public void addFirst(int element) {
        Node newest = new Node(element, null, null);
        if (isEmpty())
        {
            head = newest;
            tail = newest;
        } else {
            // Node p = tail;
            newest.next = head;
            head.prev = newest;
            head = newest;
        }

        size = size + 1;

    }

    public void insert(int element, int position) {
        if (position <= 0 || position >= size)
            return;

        Node newest = new Node(element, null, null);
        Node p = head;
        int i = 1;
        while(i < position - 1) {
            p = p.next;
            i++;
        }
        newest.prev = p;
        newest.next = p.next;
        p.next.prev = newest;
        p.next = newest;

        size++;
    }

    public int removeFirst() {
        int element = -1;
        if (isEmpty())
            return element;

        Node p = head;
        element = p.element;
        if(length() == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return element;
    }

    public int removeLast() {
        int element = -1;
        if (isEmpty())
            return element;

        Node p = head;
        element = p.element;

        if (length() == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return element;
    }

    public int delete(int position) {
        int value = -1;
        if (position <= 0 || position >= size)
            return value;

        int i = 1;
        Node p = head;

        if(position == 1) {
            value = p.element;
            removeFirst();
            return value;
        }
        while(i < position - 1) {
            p = p.next;
            i++;
        }
        value = p.next.element;
        p.next.next.prev = p;
        p.next = p.next.next;
        size--;

        return value;

    }

    public void display() {
        Node p = head;
        while(p != null) {
            System.out.print(p.element + " --> ");
            p = p.next;
        }
        System.out.println();
    }
}
