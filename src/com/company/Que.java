package com.company;

public class Que extends LinkedList{
    public void enque(int i){
        add(i);
    }
    public int deque(){
        int returnValue = peek();
        remove(0);
        return returnValue;
    }
    public int peek(){
        return get(0);
    }
}
