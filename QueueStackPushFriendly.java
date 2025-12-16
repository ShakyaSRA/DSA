
package data.structures;

import java.util.LinkedList;
import java.util.Queue;



class myStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // insert element
    void push(int x) {
        q1.add(x);
    }

    // remove top element
    void pop() {
        if (q1.isEmpty())
            return;

        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.remove();
        }
        q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // return top element
    int top() {
        if (q1.isEmpty())
            return -1;

        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.remove();
        }
        int temp = q1.peek();
        q1.remove();
        q2.add(temp);
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
        return temp;
    }

    // return current size
    int size() {
        return q1.size();
    }
}

public class queuestack_pop {
    public static void main(String[] args) {
        myStack stack = new myStack();
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());
    }
}
