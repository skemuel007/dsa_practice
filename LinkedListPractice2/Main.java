package LinkedListPractice2;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addLast(7);
        l.addLast(4);
        l.addLast(12);
        l.addLast(8);
        l.addLast(3);
        l.display();
        System.out.println("Size: " + l.length());
        l.addFirst(15);
        l.display();
        System.out.println("Size: " + l.length());
        l.addFirst(25);
        l.display();
        System.out.println("Size: " + l.length());
        l.insert(22, 0);
        l.insert(45, 3);
        l.insert(92, 9);
        l.display();
        System.out.println("Size: " + l.length());
        l.removeFirst();
        l.display();
        System.out.println("Size: " + l.length());
        l.removeLast();
        l.display();
        System.out.println("Size: " + l.length());
        l.removeAny(3);
        l.display();
        System.out.println("Size: " + l.length());

        // System.out.println(l.getElement(4).element);
    }
}
