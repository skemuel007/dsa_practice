package Stacks;

public class Main {
    public static void main(String[] args) {
        /*StacksArray s = new StacksArray(10);
        s.push(5);
        s.push(3);
        s.display();
        System.out.println("Size: " + s.length());
        System.out.println("Element popped: " + s.pop());
        System.out.println("IsEmpty: " + s.isEmpty());
        System.out.println("Element popped: " + s.pop());
        System.out.println("IsEmpty: " + s.isEmpty());
        s.push(7);
        s.push(9);
        s.display();
        System.out.println("Element top: " + s.peek());*/

        StacksLinkedList s = new StacksLinkedList();
        s.push(5);
        s.push(3);
        s.display();
        System.out.println("Size: " + s.length());
        System.out.println("Element popped: " + s.pop());
        System.out.println("IsEmpty: " + s.isEmpty());
        System.out.println("Element popped: " + s.pop());
        System.out.println("IsEmpty: " + s.isEmpty());
        s.push(7);
        s.push(9);
        s.display();
        System.out.println("Element top: " + s.peek());
    }
}
