package Assignment.Lab2;

import java.util.Scanner;

public class DeleteElementFromArray {
    int count=5;

    public static void main(String[] args) {
        int[] arr = new int[5];
        DeleteElementFromArray obj = new DeleteElementFromArray();
        Scanner in = new Scanner(System.in);
        System.out.println("Input the Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        obj.print(arr);
        System.out.println("Input element to delete:");
        for (int i = 0; i <= 5; i++) {

         if (i == 5 ){
             System.out.println("the array is empty !!");
             break;
         }else {
             obj.removeInArray(arr, in.nextInt());
             obj.print(arr);
         }
        }

    }

    public void print(int[] a){
        for (int i = 0; i < count; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public void removeInArray(int[] a, int val){

        int i = 0;
        for ( i = 0; i < count; i++) {
            if (a[i] == val)
                break;
        }
        if (i == count){
            System.out.println("The value doesn't exist in array");
            return;
        }

            for (int j = i; j < count - 1; j++) {
                a[j] = a[j + 1];
            }


            count--;

    }

}
