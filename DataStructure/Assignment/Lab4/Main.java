package DataStructure.Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Character> queue = new ArrayQueue<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("Input queue elements");
        for (int i = 0; i < 5; i++) {
            queue.enQueue(in.next().charAt(0));
            System.out.println("First = " + queue.first());
            System.out.println("size = " + queue.size());
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.deQueue()+"\t");
        }
    }
}
