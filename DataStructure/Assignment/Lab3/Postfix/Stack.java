package DataStructure.Assignment.Lab3.Postfix;

public interface Stack<E> {
    int size();
    E pop();
    E top();
    void push(E element);
    boolean isEmpty();
}
