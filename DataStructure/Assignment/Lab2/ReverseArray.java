package Assignment.Lab2;

import java.util.Arrays;

public class ReverseArray {

    public int[] reverse(int[] a){
        int num =a.length-1;
        int temp = 0;
        for (int i = 0; i < a.length/2 ; i++) {
            temp= a[i];
            a[i] = a[num];
            a[num] = temp;
            num--;
        }
            return a;
    }

    public void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ReverseArray obj = new ReverseArray();

        System.out.println(Arrays.toString(obj.reverse(arr)));;
        obj.print(arr);
    }
}
