package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList l = new CircularLinkedList();
        l.addLast(7);
        l.addLast(4);
        l.addLast(12);
        l.addLast(8);
        l.addLast(3);
        l.addFirst(25);
        l.addFirst(35);
        l.display();
        System.out.println("Size: " + l.length());
        l.insert(20, 3);
        l.insert(30, 5);
        l.insert(15, 1);
        l.display();
        System.out.println("Size: " + l.length());
        l.removeFirst();
        l.display();
        System.out.println("Size: " + l.length());
        l.removeLast();
        l.removeLast();
        l.display();
        System.out.println("Size: " + l.length());
        l.removeAt(1);
        l.display();
        System.out.println("Size: " + l.length());
    }
}
