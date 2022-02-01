package DataStructure.Assignment.Lab3;

import DataStructure.Assignment.Lab3.Stack;

public class T<E> implements Stack<E> {
    E data[];
    int t =-1;

    public T(int capacity) {
        data = (E[]) new Object[capacity];
    }


    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E element) {
        if (size() == data.length)
            throw new IllegalStateException("Sorry ..Stack is full !!");

        data[++t] = element;
    }

    @Override
    public E pop() {

        if (isEmpty())
            return null;
        E deleted = data[t];
        data[t] = null;
        --t;
        return deleted;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return data[t];
    }


}
