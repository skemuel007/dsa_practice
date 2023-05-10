package LinkedList;

public class LinkTest {

    class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node head;
    public Node tail;
    public int length;

    public LinkTest(int value) {
        var node = new Node(value);
        head = node;
        tail = node;
        length++;
    }

    public void append(int value) {
        if (head == null)
            new LinkTest(value);

        else {
            var node = new Node(value);
            var temp = tail;
            tail = node;
            temp.next = tail;
        }

        length++;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead() {
        System.out.println(head.value);
        return head;
    }

    public Node getTail() {
        System.out.println(tail.value);
        return tail;
    }

    public int getLength() {
        System.out.println("Length: " + length);
        return length;
    }

    public void prepend(int value) {
        var newNode = new Node(value);

        Node temp = head;
        if (head != null) {
            head = newNode;
            head.next = temp;
        } else  {
            head = newNode;
            tail = newNode;
        }
        length++;

    }

    public Node removeFirst() {
        var tempNode = head;
        if (length == 1) {

            head = null;
            tail = null;

        } else {
            head = head.next;
        }
        tempNode.next = null;
        length--;
        return tempNode;
    }

    public Node removeLast() {
        if (length == 0)
            return null;
        Node pre = head;
        Node temp = head;

        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = head;
        for(int i =0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value) {

        Node temp = get(index);
        if (temp == null)
            return false;
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > 0)
            return false;
        if (length == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }

    public Node remove(int index) {
        if (index < 0 || index > length) {
            return null;
        }

        if (index == 0 ) {
            // return removeFirst();
            Node temp = get(index);
            head = null;
            tail = null;
            return temp;
        }

        if ( index == length - 1) {
            return removeLast();
        }

        Node prev = get(index - 1);
        Node toRemove = prev.next;
        prev.next = toRemove.next;
        toRemove.next = null;
        length--;
        return toRemove;
    }

    public void reverse() {
        // first switch the head and tail using a temp node
        Node temp = head;
        head = tail;
        tail = temp;

        // iterate through using three pointers
        // first point to null
        // second pointer which is temp and third pointer that points to after temp

        Node after = temp.next;
        Node before = null;

        for(int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }
}
