package com.company;

public class LinkedList {

    Node head = null;
    Node tail = null;

    public void add(int e){
        Node addNode = new Node(e);
        if (head == null){
            head = addNode;
        }
        else{
            tail.next = addNode;
        }
        tail = addNode;
    }
    public void add(int i, int e){
        Node addNode = new Node(e);
        if (head == null){
            head = new Node(e);
        }
        if (i == 0){
            addNode.next = head;
            head = addNode;
        }
        else {
            for (int j = 0; j==i-1; j++){
                addNode.next = addNode;
            }
            tail.next = addNode;
            tail = addNode;
        }
    }
    public boolean contains(int e){
        Node current = head;
        while(current != null){
            if (current.data == e){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int get(int i){
        Node current = head;
        for (int j = 0; j<i; j++){
            current = current.next;
        }
        return current.data;
    }
    public void remove(int i){
        Node temp = head;
        Node prev = null;
        if (i == 0) {
            head = head.next;
        }
        else {
            for (int j = 0; j < i; j++) {
                prev = temp;
                temp = temp.next;
            }

            prev.next = temp.next;
        }
    }
    public boolean empty(){
        return head == null;
    }
    public int size(){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void show(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
