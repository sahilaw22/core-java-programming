// Implement a Stack Using Deque

import java.util.*;

public class SET4P10 {
    public static void main(String[] args) {
        Deque<Integer> Stack = new ArrayDeque<>();

        Stack.push(10);
        Stack.push(20);   // follows LIFO (last element added is the first to be removed)
        Stack.push(30);
        Stack.push(40);

        System.out.println("STACK");
        System.out.println(Stack);
        System.out.println("Popped: " + Stack.pop()); // 40
        System.out.println("Popped: " + Stack.pop()); // 30
        System.out.println("Current Stack" + Stack);  // remaining elements
        System.out.println("Stack Top: " + Stack.peek()); // top element of stack
        System.out.println("Stack is empty? \n" + Stack.isEmpty()); // false

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.addFirst(5);

        System.out.println("\nQUEUE");
        System.out.println(dq);
        System.out.println("Removed last: " + dq.removeLast()); // 1
        System.out.println("Removed second last: " + dq.removeLast()); // 2
        System.out.println("Queue is empty? " + dq.isEmpty()); // false
        System.out.println("Updated Queue: " + dq);







    }
}
