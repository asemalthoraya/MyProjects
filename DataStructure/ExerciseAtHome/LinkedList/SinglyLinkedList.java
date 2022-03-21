package ExerciseAtHome.Stack.LinkedList;

public class SinglyLinkedList {
    public static class Node{
        int data;
        Node next;
    }
    Node head,tail;
    int length;

    public SinglyLinkedList() {
        head = tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void insertFirst(int element) {
        Node newNode = new Node();
        newNode.data = element;
        if (length == 0) {
            head = tail = newNode;
            newNode.next = null;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int element) {
        Node newNode = new Node();
        newNode.data = element;
        if (length == 0) {
            head = tail = newNode;
            newNode.next = null;
        }
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
        length++;
    }

    public void insertAtPosition(int pos,int element) {
        if (pos < 0 || pos > length)
            System.out.println("Out of range");
        else {
            Node newNode = new Node();
            newNode.data = element;
            if (pos == 0)
                insertFirst(element);
            else if (pos == length)
                insertLast(element);
            Node cur = head;
            for (int i = 1; i < pos; i++) {
                cur = cur.next;
            }
                newNode.next = cur.next;
                cur.next = newNode;
            length++;
        }
    }

    public void print() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(10);
        list.insertLast(20);
        list.insertAtPosition(10,40);
        list.insertLast(50);
        list.print();
    }
}
