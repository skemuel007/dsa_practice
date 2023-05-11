package DoublyLinkedList;

public class Node {
    public int element;
    public Node next;
    public Node prev;

    public Node(int element, Node next, Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
