package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class AddingArrays {
    int []x;
    int numOfElement;

    public AddingArrays() {
        x = new int [6];
        numOfElement = 0;
    }

    public int add(int e){
        if (numOfElement < x.length){
            x[numOfElement] = e;
            numOfElement++;
            return 0;
        }else{
            return -1;
        }

    }
    public int addSorted(int e) {
        if (numOfElement < x.length) {
            int i = numOfElement;
            while (i > 0 && e < x[i - 1]) {
                x[i] = x[i - 1];
                i--;
            }
            x[i] = e;
            numOfElement++;
            return 0;
        } else {
            return -1;
        }
    }
    public int deleteElement(){
            if (numOfElement >0 ){
                x[numOfElement - 1] = Integer.MIN_VALUE;
                numOfElement--;
                return 0;
            }
            return -1;
        }
        public int deleteSortedElement(int item){
            if (item < numOfElement && item >= 0 ){
                int i = item;
                while (i < numOfElement - 1) {
                    x[i] = x[i+1];
                    i++;
                }
                x[i] = Integer.MIN_VALUE;
                numOfElement--;
                    return 0;
            }
            return -1;
        }

        public int sequentialSearch(int key){
            int index =-1;
            int i=0;
            boolean found = false;
            while(i < numOfElement && !found){
                if (x[i] == key) {
                    index = i;
                    found = true;
                }
                i++;
            }
                return index;
        }

    public static void main(String[] args) {
        AddingArrays test = new AddingArrays();
        Scanner in = new Scanner(System.in);
        System.out.println("Input the elements");

    //        Add Elements

        for (int i = 0; i < 6; i++) {
            if (test.addSorted(in.nextInt()) == 0){

                System.out.println("Add Successfully");
                System.out.println(Arrays.toString(test.x));
            }
            else
                System.out.println("Arrays is full");
        }



        /*        ****Deleted Elements
        for (int i = 0; i < 7; i++) {
            if (test.deleteElement() == 0){

                System.out.println("Deleted Successfully");
                System.out.println(Arrays.toString(test.x));
            }

}*/
 /*
        ****Deleted sorted elements

        for (int i = 0; i < 6; i++) {
            if (test.deleteSortedElement(i) == 0){

                    System.out.println("Deleted Successfully");
                    System.out.println(Arrays.toString(test.x));

            }
        }
#*/
        for (int i = 0; i < 6; i++) {
            if (test.sequentialSearch(in.nextInt()) == 0){

                System.out.println("Found");
                System.out.println(Arrays.toString(test.x));
            }
            else
                System.out.println("Not found");
        }
    }
}
