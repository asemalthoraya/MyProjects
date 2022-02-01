package DataStructure.Assignment.Lab3.RecursiveMethod;

public class UsingRecursiveToRemove<E> implements Stack<E>{
    E[]data;
    int t = -1;

    public UsingRecursiveToRemove(int capacity) {
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
        if (size() == data.length) System.out.println("Stack is Full !!");
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
        if (isEmpty()) return null;
        return data[t];
    }
    @Override
    public Object cleanStack(Stack e) {
       if (isEmpty())return e;
       e.pop();
       cleanStack(e);
        return 0;
    }


}
