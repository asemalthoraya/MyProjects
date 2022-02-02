package DataStructure.Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFiles {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayQueue<String> fileToPrint = new ArrayQueue<>(3);
        Scanner in = new Scanner(System.in);
        System.out.println("Input path and file name to print");
        for (int i = 0; i < 3; i++) {
            fileToPrint.enQueue(in.next());
        }
        System.out.println("Print files queue");
        while (!fileToPrint.isEmpty()){
            Scanner fileScan = new Scanner(new File(fileToPrint.deQueue()));
            while(fileScan.hasNextLine())
                System.out.println(fileScan.nextLine());
        }
    }
}
