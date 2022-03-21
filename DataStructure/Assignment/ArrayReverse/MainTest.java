package DataStructure.ArrayReverse;

import java.util.Arrays;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        // create Stack
        ArrayStack<Integer> obj = new ArrayStack<>(5);
        //display if the stack is empty
        System.out.println("Is the stack is Empty? "+ obj.isEmpty());
        //declare array
        int[] arr = {10,20,30,40,50};
        // display the array elements
        System.out.println(Arrays.toString(arr));
        //push the elements inside the stack
        for (int i = 0; i < arr.length; i++) {
            obj.push(arr[i]);
        }
        //pop the elements from stack and put them to array

        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.pop();
        }
        System.out.println("After reversing array using stack :");
        // display the array elements
        System.out.println(Arrays.toString(arr));
    }
}
