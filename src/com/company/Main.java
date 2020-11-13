package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Stack stack = new Stack();
        Que que = new Que();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1,99);
        linkedList.add(2,99);
        linkedList.show();

    }
}
