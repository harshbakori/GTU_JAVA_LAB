import java.io.*;
class t7_3copy
{
    public static void main(String[] args) throws IOException
    {
        int ch;
        File f = new File(args[0]);
        if(f.exists())
        {
            f.createNewFile();
        }
        FileOutputStream fout = new FileOutputStream("copy.txt");
        FileInputStream fin = new FileInputStream("test.txt");
        BufferedInputStream br = new BufferedInputStream(fin);
        BufferedOutputStream bw = new BufferedOutputStream(fout);
        while((ch=br.read())!=-1)
        {
            bw.write((char)ch);
        }
        System.out.println("Successefull...");
        fin.close();
        br.close();
        bw.close();
        fout.close();
    }
} 