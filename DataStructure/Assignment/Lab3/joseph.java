
public class joseph {

        static int joseph(int m, int b)
        {
            if (m == 1)
                return 1;
            else
                return (joseph(m- 1, b) + b-1) % m + 1;
        }


        public static void main(String[] args)
        {
            int m = 10;
            int b =2 ;
            System.out.println("The chosen place is " + joseph(m, b));
        }
    }


