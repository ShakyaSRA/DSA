package data.structures;

import java.util.Stack;

public class StackQueueD {

    static class myQueue {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Enqueue operation
        void enqueue(int x) {

            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push the new item into s1
            s1.push(x);

            // Push everything back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Dequeue operation
        void dequeue() {
            if (s1.isEmpty()) {
                return;
            }
            s1.pop();
        }

        // Front operation
        int peek() {
            if (s1.isEmpty()) {
                return -1;
            }
            return s1.peek();
        }

        // Size operation
        int size() {
            return s1.size();
        }
    }

    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        System.out.println("Front: " + q.peek());
        System.out.println("Size: " + q.size());

        q.dequeue();

        System.out.println("Front: " + q.peek());
        System.out.println("Size: " + q.size());

    }
}
