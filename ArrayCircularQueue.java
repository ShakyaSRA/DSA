package data.structures;

public class ArrayCircularQueue {

    int[] queue;
    int front, rear, size, capacity;

    ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Check if queue is full
    boolean isFull() {
        return size == capacity;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Enqueue operation
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    // Dequeue operation
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        front = (front + 1) % capacity;
        size--;

        // Reset when queue becomes empty
        if (size == 0) {
            front = -1;
            rear = -1;
        }
    }

    // Display queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        ArrayCircularQueue cq = new ArrayCircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display();

        cq.dequeue();
        cq.dequeue();

        cq.display();

        cq.enqueue(60);
        cq.enqueue(70);

        cq.display();

    }
}
