package DataStructure.Assignment.Lab3;

import DataStructure.Assignment.Lab3.S;
import DataStructure.Assignment.Lab3.T;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        T<Integer> stack1 = new T<>(5);
        T<Integer> stack2 = new T<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("is the stack1 Empty :" + stack1.isEmpty());
        System.out.println("is the stack2 Empty :" + stack2.isEmpty());
        System.out.println("Input the Elements for stack1:" );
        for (int i = 0; i < 5; i++) {
            stack1.push(in.nextInt());
            System.out.println("top =" + stack1.top());
        }

        System.out.println("after transfer :");

        stack2 = stack1;
        System.out.println("top of stack 2 ="+stack2.top());
        System.out.println(stack2.pop());
    }
}
