//string vovel count
import java.util.Scanner;
class t3_2
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = Sc.nextLine();
        int vov=0,consolin=0;
        char s;
        for(int i=0;i<a.length();i++)
        {   
            s=a.charAt(i);
            if (s=='a'||s=='e'||s=='i'||s=='o'||s=='u') 
            {
                vov++;
            }
	    else if(s>='a' && s<='z')
	    {consolin++;}
        }
        
        System.out.println("There are "+ vov +" vovels");
        System.out.println("There are "+ consolin +" consolins");
        Sc.close();
    }
}