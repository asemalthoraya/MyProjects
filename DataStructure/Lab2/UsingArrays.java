package Lab2;

import java.util.Arrays;

public class UsingArrays {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(arr));
//        System.out.println("After reverse");
//        System.out.println(Arrays.toString(reverse(arr)));
//
        System.out.println("After shift left");
        System.out.println(Arrays.toString(shiftLeft(arr)));

        System.out.println("After shift Right");
        System.out.println(Arrays.toString(shiftRight(arr)));
    }
    public static int[] shiftLeft(int[] b){
        int rotate = b[0];
        for (int i = 0; i < b.length-1; i++) {
            b[i] = b[i + 1];
        }
        b[b.length -1 ] =rotate;
        return b;
    }
    public static int[] shiftRight(int[] b){
        int rotate = b[b.length -1];
        for (int i = b.length -1; i > 0; i--) {
            b[i] = b[i - 1];
        }
        b[0] =rotate;
        return b;
    }
    public static int[] reverse(int[] a) {
        int temp;
        int size = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[size];
            a[size] = temp;
            size--;
        }
        return a;
    }
}
