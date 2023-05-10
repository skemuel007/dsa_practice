package LinkedListPractice2;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
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

    public void addLast(int element) {
        Node newest = new Node(element, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.next = newest;
        }
        tail = newest;
        size = size + 1;
    }

    public Node getElement(int index) {
        if (index >= size || index < 0) {
            return null;
        }

        Node p = head;
        int counter = 0;
        while(p != null && counter != index) {
            p = p.next;
            counter++;
        }
        return p;
    }

    public void addFirst(int element) {
        Node newest = new Node(element, null);

        if ( isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            newest.next = head;
            head = newest;
        }

        size = size + 1;
    }

    public void insert(int element, int index) {
       if (index < 0 || index > size)
           throw new IndexOutOfBoundsException("Index out of bounds: either it is less than 0 or greater than size of list");

       if (index == 0) {
           addFirst(element);
           return;
       }

       if ( index == size) {
           addLast(element);
           return;
       }

       Node newest = new Node(element, null);
       Node p = getElement(index - 1);
       newest.next = p.next;
       p.next = newest;
       size = size + 1;
    }

    public int removeAny(int position) {
        if (position <= 0 || position >= size - 1) {
            return -1;
        }

        Node p = head;
        int i = 1;

        while(i < position - 1) {
            p = p.next;
            i++;
        }
        int element = p.element;
        p.next = p.next.next;
        size = size - 1;

        return element;
    }

    public int removeFirst() {
        if (isEmpty())
            return -1;

        Node temp = head;
        head = head.next;

        temp.next = null;
        size = size - 1;

        if (isEmpty()) {
            tail = null;
        }

        return temp.element;
    }

    public int removeLast() {
        if (isEmpty()) {
            return -1;
        }

        Node p = head;
        int i = 1;
        while (i < size - 1 ){
            p = p.next;
            i = i + 1;
        }

        tail = p;
        p = p.next;
        int lastElement = p.element;
        tail.next = null;
        size = size - 1;
        return lastElement;
    }

    public int search(int searchTerm) {
        Node p = head;
        int index = 0;

        while(p != null) {
            if (p.element == searchTerm) {
                return index;
            }
            index++;
            p = p.next;
        }

        return -1;
    }

    public void insertSorted(int e) {
        Node newest = new Node(e, null);
        if (isEmpty())
            head = newest;
        else {
            Node p = head;
            Node q = head;
            while(p != null && p.element < e) {
                q = p;
                p = p.next;
            }

            if (p == head) {
                newest.next = head;
                head = newest;
            } else {
                newest.next = q.next;
                q.next = newest;
            }
        }

        size = size + 1;
    }

    public void display() {
        Node p = head;

        while(p != null) {
            System.out.print(p.element + " => ");
            p = p.next;
        }
        System.out.println();
    }
}
