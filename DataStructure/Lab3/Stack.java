package DataStructure.Lab3;

public interface Stack<E> {
    boolean isEmpty();
    int size();
    void push(E e);
    E pop();
    E top();
}
