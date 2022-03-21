package DataStructure.Lab5;

import java.util.Scanner;

public class TestSinglyList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("1.add from first\t 2.add from last\n3.remove from first\t0.exit");
        int choice = -1;
        while (choice != 0) {
            System.out.print("Your choice : ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input name : ");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.print("input from last : ");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.print ("element deleted: " + list.removeFirst());
                    System.out.println();
                    break;
                case 0:System.exit(0);
            }
            System.out.println("First =" + list.first()+"\t last = " + list.last() + "\t size = " + list.size());
        }
    }
}
