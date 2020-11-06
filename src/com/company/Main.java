package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Stack stack = new Stack();
        Que que = new Que();
        que.enque(1);
        que.enque(2);
        System.out.println(que.peek());
        System.out.println(que.deque());
        System.out.println(que.peek());
        que.enque(3);
        System.out.println(que.deque());
        System.out.println(que.peek());
    }
}
