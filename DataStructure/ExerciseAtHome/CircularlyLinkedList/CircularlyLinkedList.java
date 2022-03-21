package ExerciseAtHome.CircularlyLinkedList;

import java.util.Scanner;

public class CircularlyLinkedList<E>
{
    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty())return null;
        return tail.getNext().getElement();
    }
    public E last() {
        if (isEmpty())return null;
        return tail.getElement();
    }

    public void addFirst(E element) {
        if (isEmpty()) {
            tail = new Node<E>(element, null);
            tail.setNext(tail);
        }else {
            Node<E> newest = new Node<E>(element, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E element) {
        addFirst(element);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> head = tail.getNext();
        E deleted = head.getElement();
        if (head == tail)
            tail=null;
        else
            tail.setNext(head.getNext());
        size--;
        return deleted;
    }

    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }
    public static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }
    }

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
