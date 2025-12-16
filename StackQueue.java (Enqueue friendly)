package data.structures;

import java.util.Stack;

class stack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue 
    void enqueue(int x) {
        s1.push(x);
    }

    // Dequeue 
    int dequeue() {
        if (s1.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        // Move all elements to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Pop front element
        int front = s2.pop();

        // Move back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return front;
    }

    // Size of queue
    int size() {
        return s1.size();
    }

    // Is empty
    boolean isEmpty() {
        return s1.isEmpty();
    }
}

public class StackQueue {

    public static void main(String[] args) {
        stack q = new stack();

        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

        System.out.println("Size: " + q.size());
        System.out.println("Is Empty? " + q.isEmpty());

        q.enqueue(40);

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
    }

}
