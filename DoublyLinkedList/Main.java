package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.addLast(7);
        l.addLast(12);
        l.addLast(4);
        l.display();
        System.out.println("Size: " + l.length());
        l.addLast(8);
        l.addLast(3);
        l.display();
        System.out.println("Size: " + l.length());
        l.addFirst(15);
        l.display();
        System.out.println("Size: " + l.length());
        l.insert(20, 3);
        l.display();
        System.out.println("Size: " + l.length());
        l.removeFirst();
        l.display();
        System.out.println("Size: " + l.length());
        l.removeLast();
        l.display();
        System.out.println("Size: " + l.length());
        l.delete(2);
        l.display();
        System.out.println("Size: " + l.length());
        l.delete(1);
        l.display();
        System.out.println("Size: " + l.length());
    }
}
