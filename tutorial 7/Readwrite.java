import java.io.*;//file output stream demo

class Readwrite
{
    
    public static void main(String[] args) throws IOException
    {
        int ch;
        FileOutputStream fout = new FileOutputStream("test.txt");
        for(int i=65;i<91;i++)
        {
            fout.write((char)i);
        }
        fout.close();
        
        FileInputStream fin = new FileInputStream("test.txt");
        while((ch=fin.read())!=-1)
        {
            System.out.print((char)ch);
        }
        fin.close();
    
        FileWriter fw = new FileWriter("wr1.txt");
        for(int i=0;i<10;i++)
        {
           fw.write(i);
        }
        fw.close();
        System.out.println("\n");
        FileReader fr = new FileReader("wr1.txt");
        while((ch=fr.read())!=-1)
        {
            System.out.print(ch);
        }
        fr.close();
    }

}