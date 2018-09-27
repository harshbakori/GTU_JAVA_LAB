import java.io.*;
import java.net.*;
class client
{
    public static void main(String[] args) throws Exception
    {
        Socket s = new Socket("localhost",7777);
        
        InputStream objin = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(objin));
        OutputStream objout = s.getOutputStream();
        PrintStream ps = new PrintStream(objout);

        String str;
        while((str = br.readLine())!=null)
        {
            System.out.println("from server: " + str);
            ps.println("1");
        }

        ps.print("client replied..");
        while((str = br.readLine())!=null)
        {
            System.out.println("from server: " + str);
            ps.println("1");
        }

        br.close();
        s.close();
    }
}