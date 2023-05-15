package Stacks;

public class StacksArray {
    int[] data;
    int top;

    public StacksArray(int size) {
        data = new int[size];
        top = 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int length() {
        return top;
    }

    public boolean isFull() {
        return top == data.length;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }

        return data[top - 1];
    }

    public void push(int value) {
        if(!isFull()) {
            data[top] = value;
            top++;
        } else {
            System.out.println("Either stack is empty or full");
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }
        int value = data[top - 1];
        data[top - 1] = 0;
        top--;
        return value;
    }

    public void display() {
        for(int i = 0; i< top; i++) {
            System.out.print(data[i] + "--");
        }
        System.out.println();
    }
}
