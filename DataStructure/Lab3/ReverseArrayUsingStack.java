package DataStructure.Lab3;

import java.util.Arrays;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[]arr = {11,12,13,14,15};
        System.out.println(Arrays.toString(arr));
        ArrayStack<Integer> buffer = new ArrayStack<>(5);
        for (int i = 0; i < 5; i++) {
            buffer.push(arr[i]);
        }
        for (int i = 0; i < 5; i++) {
            arr[i] = buffer.pop();
        }
        System.out.println("After reversing array using Stack");
        System.out.println(Arrays.toString(arr));
    }
}
