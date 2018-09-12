import java.io.*;
class t7_1
{
    public static void main(String[] args) throws IOException
    {
        int ch;
        StringBuffer sf = new StringBuffer();
        FileReader fr = new FileReader(args[0]);
        while((ch=fr.read())!=-1)
        {
            sf.append((char)ch);
        }
        System.out.println(sf);
        System.out.println(sf.length());
        for (int i = 0; i < sf.length(); i++) {
            char c = sf.charAt(i);
            sf.setCharAt(i, Character.toLowerCase(c));
         }
        System.out.println(sf);

        fr.close();
    }
}