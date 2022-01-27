package DataStructure.Lab3;

public class ArrayStack<E> implements Stack<E>{
    E data[];
    static final int CAPACITY=100;
    int t=-1;

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public ArrayStack() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E e) {
    if (size() == data.length)
        throw new IllegalStateException("Stack is Full");
        data[++t] = e;
    }

    @Override
    public E pop() {
        if (isEmpty())
            return null;
        E deleted =data[t];
        data[t] = null;
        t--;
        return deleted;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return data[t];
    }
}
