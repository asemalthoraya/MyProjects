package DataStructure.Assignment.Lab3.RecursiveMethod;

public interface Stack <E>{
    E pop();
    void push(E element);
    E top();
    boolean isEmpty();
    int size();
    Object cleanStack(Stack e);
}
