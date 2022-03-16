package DataStructure.Lab7;

import ExerciseAtHome.DoublyLinkedList.DoublyLinkedList;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ExerciseAtHome.DoublyLinkedList.DoublyLinkedList<String> obj = new DoublyLinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("1.add first\t2.add last\n3.remove first\t4.remove last\n0.exit");
        int choice = -1;
        while (choice != 0) {
            System.out.print("Input your choice:");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("input name: ");
                    obj.addFirst(in.next());
                    System.out.println("first element = "+obj.first()+"\t last element = "+obj.last()+"\t size = " + obj.size());
                    break;
                case 2:
                    System.out.print("input last name: ");
                    obj.addLast(in.next());
                    System.out.println("first element = "+obj.first()+"\t last element = "+obj.last()+"\t size = " + obj.size());
                    break;
                case 3:
                    System.out.println("you have deleted from first : " + obj.removeFirst());
                    System.out.println("first element = "+obj.first()+"\t last element = "+obj.last()+"\t size = " + obj.size());
                    break;
                case 4:
                    System.out.println("you have deleted from last : " + obj.removeLast());
                    System.out.println("first element = "+obj.first()+"\t last element = "+obj.last()+"\t size = " + obj.size());
                    break;
                case 0:System.exit(0);
            }
        }
    }
}
