import java.io.*;
import java.util.Scanner;

class t7_2readword
{
    public static void main(String[] args) throws IOException
    {
        int ch,count=0;
        //char h = " ";
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter file name (no need to enter extension)");
        String name = Sc.nextLine();
        File f = new File(name + ".txt");
        FileInputStream fin = new FileInputStream(name + ".txt");
        while((ch=fin.read())!=-1)
        {
            System.out.print((char)ch);
            if(ch==32)
            {
                count++;
            }
        }
        count++;
        System.out.println("\nTotal words are = " + count);
        System.out.println("\nSize of the file is = " +(double)f.length()/1024 + " kb");
        fin.close();
        Sc.close();
    }
}