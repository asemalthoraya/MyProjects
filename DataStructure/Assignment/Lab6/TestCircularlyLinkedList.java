package DataStructure.Lab6;

import java.util.Scanner;

public class TestCircularlyLinkedList {
    public static void main(String[] args) {
        CircularlyLinkedList<String> obj = new CircularlyLinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("1.add first\t2.add last\n3.rotate \t4.remove first\n0.exit");
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
                    obj.rotate();
                    System.out.println("after rotate first element = "+obj.first()+"\t last element = "+obj.last()+"\t size = " + obj.size());
                    System.out.println();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("you have deleted from first : " + obj.removeFirst());
                    System.out.println("first element = "+obj.first()+"\t last element = "+obj.last()+"\t size = " + obj.size());
                    break;
                case 0:System.exit(0);
            }
        }
    }
}
