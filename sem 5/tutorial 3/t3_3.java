import java.util.Scanner;
class t3_3
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the string. ");
        String s = Sc.nextLine();
        int n=s.length();
        System.out.println("The length of the string is = "+ n);
        System.out.println("the second half of the steing is =");
        for(int i=n/2;i<n;i++)
        {
            System.out.print(s.charAt(i));
        }
        Sc.close();
    }
}
