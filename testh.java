import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

class testh
{
    public static void main(String[] args) throws Exception
    {
        for(int i=0;i<4;i++)
        {
            for(int k=4;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        FileWriter fr = new FileWriter("test11.bat");
        BufferedWriter br = new BufferedWriter(fr);
        br.write("@echo off \n echo this is the test \n pause ");
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        try
        {
           // runtime.exec("test11.bat");        //opens new notepad instance
 
             runtime.exec("firefox.exe");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        br.close();
        fr.close();
    }
}