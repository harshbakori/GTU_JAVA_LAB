import java.util.Scanner;
class t2_5
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = Sc.nextLine();
        int n = a.length();
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++)
            {
                System.out.print(a.charAt(k)+" ");
            }
            System.out.print("\n");
        }   
        Sc.close();
    }
}