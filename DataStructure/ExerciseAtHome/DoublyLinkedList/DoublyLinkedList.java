package ExerciseAtHome.DoublyLinkedList;

import ExerciseAtHome.CircularlyLinkedList.CircularlyLinkedList;

import java.util.Scanner;

public class DoublyLinkedList<E> {
    private Node<E> header = null;
    private Node<E> trailer = null;
    private int size =0;

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty())return null;
        return header.getNext().getElement();
    }
    public E last() {
        if (isEmpty())return null;
        return trailer.getPrev().getElement();
    }

    public void addBetween(E element, Node<E> p, Node<E> n) {
        Node<E> newest = new Node<>(element, p, n);
        p.setNext(newest);
        n.setPrev(newest);
        size++;
    }

    public void addFirst(E element) {
        addBetween(element,header,header.getNext());
    }

    public void addLast(E element) {
        addBetween(element,trailer.getPrev(),trailer);
    }
    public E remove(Node<E> x) {
        Node<E> p = x.getPrev();
        Node<E> n = x.getNext();
        p.setNext(n);
        n.setPrev(p);
        size--;
        return x.getElement();
    }

    public E removeFirst() {
        if (isEmpty())return null;
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev());
    }
    public static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev,Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList<String> obj = new DoublyLinkedList<>();
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
