package DataStructure.ArrayReverse;

public class ArrayStack <E> implements Stack<E>{
    E data[];
    int top =-1;

    public ArrayStack(int CAPACITY) {
        data = (E[]) new Object[CAPACITY];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void push(E element) {
        if (size()==data.length)
            System.out.println("Stack is full");
        data[++top] = element;
    }

    @Override
    public E pop() {
        if (isEmpty())
            return null;
        E deleted = data[top];
        data[top] = null;
        top--;
        return deleted;
    }

    @Override
    public E top() {
        if (!isEmpty())
            return data[top];
        return null;
    }

    @Override
    public int size() {
        return top+1;
    }
}
