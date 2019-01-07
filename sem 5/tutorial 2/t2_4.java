import java.util.Random;
import java.util.Scanner;

//import com.sun.prism.paint.Stop;
class t2_4
{
    public static void main(String[] args)
    {
        Scanner Sc= new Scanner(System.in);
            System.out.println("enter the number of characters you want");
                int n = Sc.nextInt();
                char ch;
            for(int i=0;i<n;i++)
            {
                ch=(char)(26*Math.random()+'A');
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                   n++;
                    continue;
                }
                System.out.println(ch);
            }
        Sc.close();
    }
    
}