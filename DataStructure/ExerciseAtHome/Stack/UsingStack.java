package ExerciseAtHome.Stack;

import java.util.Scanner;

public class UsingStack<E> implements Stack<E> {
    E data[];
    int top = -1;

    public UsingStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top +1;
    }

    @Override
    public E pop() {
        if (isEmpty())
            return null;
        E delete = data[top];
        data[top] = null;
        top--;
        return delete;
    }

    @Override
    public void push(E element) {
        if (size() == data.length)
            System.out.println("Stack is full");
        data[++top] = element;
    }

    @Override
    public E Top() {
        if (!isEmpty())
            return data[top];
        return null;
    }

    public static void main(String[] args) {
        UsingStack<Integer> stack = new UsingStack<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("is the stack is Empty? " + stack.isEmpty());
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter elements :");
            stack.push(in.nextInt());
            System.out.println("Top = " + stack.Top());
            System.out.println("size = " + stack.size());
        }
        System.out.println("After pop");
        for (int i = 0; i < 5; i++) {
            System.out.println("the element that have been deleted = " + stack.pop());
            System.out.println("Top = " + stack.Top());
            System.out.println("size = " + stack.size());
        }

    }
}
