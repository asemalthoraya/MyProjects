import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        int []arr =new int[6];
        a a1 = new a();
        a1.input(arr);
        print(arr);
    }
    public static void print(int []x){
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+"\t");
        }
    }
    public  void input(int []y){
        Scanner in = new Scanner(System.in);
        int u;
        System.out.println("Enter the Elements");
        for (int i = 0; i < y.length; i++) {
            y[i] = in.nextInt();
        }
    }
}
