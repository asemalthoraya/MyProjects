package DataStructure.Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> myStack =new ArrayStack<>(5);
        Scanner in =new Scanner(System.in);
        System.out.println("is Stack is Empty?"+myStack.isEmpty());
        System.out.println("Input the elements");
        for (int i = 0; i < 5; i++) {
            myStack.push(in.nextInt());
            System.out.println("top = " + myStack.top());
            System.out.println("size of Stack = " + myStack.top());
        }
        System.out.println("After Calling pop:");
        while (!myStack.isEmpty()) {
            myStack.pop();
            System.out.println("Top = " + myStack.pop());
            System.out.println("size of stack = " + myStack.size());
        }
    }
}
