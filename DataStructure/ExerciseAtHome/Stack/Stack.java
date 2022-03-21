package ExerciseAtHome.Stack;

public interface Stack<E>{
    boolean isEmpty();
    int size();
    E pop();
    void push(E element);
    E Top();
}
