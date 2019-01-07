// primenumber upto n..
import java.util.Scanner;
class t2_2
{
    public static void main(String args[])
    {
        int i,j;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter numarical value for n");
        int n = Sc.nextInt();
        outerloop:
        for(i=1;i<=n;i++)
        {
            for(j=2;j<Math.sqrt(n);j++) 
            {
                if(i%j == 0)
                {
                    continue outerloop;
                }
            }
                System.out.println(i);
        }
        Sc.close();   
    }
}