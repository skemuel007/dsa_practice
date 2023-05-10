package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkTest l = new LinkTest(5);
        l.prepend(3);
        l.prepend(4);
        l.prepend(22);

        l.printList();
    }
}
