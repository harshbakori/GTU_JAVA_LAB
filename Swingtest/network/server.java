import  java.io.*;
import java.net.*;
class server{
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(7777);

        Socket s = ss.accept();
        System.out.println("connected");

        OutputStream objout = s.getOutputStream();
        PrintStream ps = new PrintStream(objout);
        InputStream objin = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(objin));

        String str = "hii harsh";
        ps.println(str);
        ps.println("This is server program");
        
        ps.println("exiting the server");

        String str1;
        while((str1 = br.readLine())!=null)
        {
            System.out.println("from client: " + str1);
        }
        ps.print("server replied..");
        ps.close();
        ss.close();
        s.close();

    }
}