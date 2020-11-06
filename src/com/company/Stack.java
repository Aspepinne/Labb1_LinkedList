package com.company;

public class Stack extends LinkedList{
    public void push(int i){
        add(0, i);
    }
    public int pop(){
        int returnValue = peek();
        remove(0);
        return returnValue;
    }
    public int peek(){
        return get(0);
    }
}
