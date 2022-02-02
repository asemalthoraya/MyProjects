package DataStructure.Lab4;

public class ArrayQueue<E> implements Queue<E> {

    E[] data;
    static final int CAPACITY = 100;
    int size = 0;
    int f = 0;

    public ArrayQueue(int c) {
        data = (E[]) new Object[c];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enQueue(E element) {
        if (size() == data.length)
            throw new IllegalStateException("Queue is full");

        int i = (f + size) % data.length;
        data[i] = element;
        size++;
    }

    @Override
    public E deQueue() {
        if (isEmpty())return null;
        E delete  = data[f];
        data[f] = null;
        f = (f+1) % data.length;
        size--;
        return delete;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }
}
