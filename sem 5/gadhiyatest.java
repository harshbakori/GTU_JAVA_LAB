import java.lang.*;
import java.util.*;
class gadhiyatest
{
    public static void main(String[] args) throws Exception
    {
        LinkedList l1 = new LinkedList();
        for(int i =0;i<100;i++)
        {
            l1.add(i+1);
        }
        System.out.println(l1);
        for(int i=0;i<99;i++)
        {
            l1.remove(i);
            i++;
        }
    }
}