package DataStructure.ArrayReverse;

public interface Stack<E> {
    boolean isEmpty();
    void push(E element);
    E pop();
    E top();
    int size();
}
