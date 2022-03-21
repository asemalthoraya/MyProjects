package ExerciseAtHome.Stack.Queue;

import java.util.Scanner;

public class UsingQueue<E> implements ExerciseAtHome.Stack.Queue.Queue<E> {
    E[] data;
    int sz = 0;
    int f=0;
    final static int CAPACITY = 5;
    public UsingQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public UsingQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    @Override
    public int size() {
        return sz;
    }


    @Override
    public void EeQueue(E element) {
        if (size() == data.length)
            System.out.println("Queue is full");
        int index = (f+sz) % data.length;
        data[index] = element;
        sz++;
    }
    @Override
    public E DnQueue() {
        if (isEmpty())
            return null;
        E deleted = data[f];
        data[f] = null;
        f = (f+1) % data.length;
        sz--;
        return deleted;
    }

    @Override
    public E first() {
        if (isEmpty())
        return null;
        return data[f];
    }

    public static void main(String[] args) {
        UsingQueue<Integer> queue = new UsingQueue<>();
        Scanner in = new Scanner(System.in);
        System.out.println("IS the queue empty ? " + queue.isEmpty());
            System.out.println("Input the elements :");
        for (int i = 0; i < 5; i++) {
            queue.EeQueue(in.nextInt());
            System.out.println("first = " + queue.first());
            System.out.println("size = " + queue.size());
        }
        System.out.println("Queue elements are :" );
        while (!queue.isEmpty()) {
            System.out.print(queue.DnQueue() + " ");
        }
    }

}
