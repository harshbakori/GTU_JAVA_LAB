//tutorial 2_5
import java.util.Scanner;
class t2_6
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter thr number of line you want");
        int n = Sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }   
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = n; k > i; k--)
            {
                System.out.print("* ");
            }
        System.out.print("\n");
        }
        Sc.close();
    }
}