package QueuesDataStructure;

public class QueuesArray {
    int[] data;
    int front;
    int rear;
    int size;

    public QueuesArray(int length) {
        data = new int[length];
        front = 0;
        rear = 0;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void enqueue(int element) {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }

        data[rear] = element;
        rear++;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int element = data[front];
        front = front + 1;
        size--;
        return element;
    }

    public void display() {
        for (int i = front; i < rear; i++) {
            System.out.print(data[i] + "-->");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueuesArray q = new QueuesArray(5);
        q.enqueue(5);
        q.enqueue(3);
        q.display();
        System.out.println("Size: "+ q.length());
        q.dequeue();
        q.display();
        System.out.println("Size: "+ q.length());
        System.out.println("IsEmpty: " + q.isEmpty());
        q.dequeue();
        q.display();
        System.out.println("Size: "+ q.length());
        System.out.println("IsEmpty: " + q.isEmpty());
        q.enqueue(9);
        q.enqueue(7);
        q.enqueue(4);
        q.display();
        System.out.println("Size: "+ q.length());
    }
}
