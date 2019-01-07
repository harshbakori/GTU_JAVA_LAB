import java.io.*;   //file atributes demo
import java.util.*;
class Fileatt
{
    public static void main(String[] args) throws IOException
    {
        File f = new File(args[0]);
        if(f.exists())
        {
            System.out.println("File exist  "  + f.getName());
        }
        else
        {
            f.createNewFile();
            if(f.exists())
            {
                System.out.println("New file created " + f.getName());
            }
        }
        System.out.println("The path is = \""+f.getAbsolutePath()+"\"");
        System.out.println("Read permission = "+ f.canRead());
        System.out.println("Write permission = "+ f.canWrite());
        System.out.println("Hiddne = " + f.isHidden());
        File f2 = new File("text2.txt");
        if(f.renameTo(f2))
        {
            System.out.println("Renamed");
        }    
    }
}