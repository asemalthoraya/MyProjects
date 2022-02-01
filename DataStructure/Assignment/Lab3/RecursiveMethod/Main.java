package DataStructure.Assignment.Lab3.RecursiveMethod;

public class Main {
    public static void main(String[] args) {
        UsingRecursiveToRemove<Integer> stack = new UsingRecursiveToRemove<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top =" + stack.top());
        stack.cleanStack(stack);
        System.out.println("Top =" + stack.top());
    }
}
