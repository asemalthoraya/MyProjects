import java.util.Scanner;

public class FindingSecond {
    Singlyinked start;
    Finding_Second()
    {
        start = null;
    }

    public void add(int data)
    {
        if(this.start == null)
        {
            Singlyinked temp = new Singlyinked(data);
            this.start = temp;
        }
        else
        {
            Singlyinked temp = new Singlyinked(data);
            temp.next = this.start;
            this.start = temp;
        }
    }

    public int findSecondLastNode(Singlyinked ptr)
    {

        Singlyinked temp = ptr;


        if(temp == null || temp.next == null)
            return -1;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args)
    {
        FindingSecond list = new FindingSecond();
        Scanner in=new Scanner(System.in);
        System.out.println("input the num:");
        int m = 0;
        {

        for (int i = 0; i <4 ; i++)

          list.add(in.nextInt());



        }
        list.add(m);
        System.out.println("The second element is:\t"+list.findSecondLastNode(list.start));

    }
}

