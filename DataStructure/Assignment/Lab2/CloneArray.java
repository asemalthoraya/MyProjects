package Assignment.Lab2;

import javax.swing.*;
import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        CloneArray obj = new CloneArray();
        int[] arr= {1,2,3,4,5};
        int[] copyArrays;
        copyArrays = arr;
        System.out.println(Arrays.toString(obj.copyArray(arr, copyArrays)));
        System.out.println("The backup of array:");
        System.out.println(Arrays.toString(copyArrays));
    }
    public int[] copyArray(int[] a, int[] x){
        x=a;
        return x;
    }

}
