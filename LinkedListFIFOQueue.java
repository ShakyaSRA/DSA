package data.structures;

public class LinkedListFIFOQueue {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    // Enqueue operation (insert at rear)
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) { 
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue operation (remove from front)
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Peek front element
    int peek() {
        if (front == null) {
            return -1;
        }
        return front.data;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == null;
    }

    // Display queue
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue (Front -> Rear): ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Front: " + queue.peek());

        queue.dequeue();
        queue.display();

        System.out.println("Is Empty: " + queue.isEmpty());
    }
}
