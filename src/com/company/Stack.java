package com.company;

public class Stack extends LinkedList{
    public void push(int i){
        add(i);
    }
    public int pop(){
        int returnValue = peek();
        remove(size()-1);
        return returnValue;
    }
    public int peek(){
        return get(size()-1);
    }
}
