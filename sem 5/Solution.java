import java.io.*;
import java.util.*;

public class Solution
{
   
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Solution s1=new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element");
        int n = sc.nextInt();

        if(n>0)
        {   
            int i = 0;
            System.out.println("enter the element");
            String ne = sc.nextLine();
            String s[] = ne.split(" ");

            int arr1[] = new int[n];
            for (i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(s[i]);
                System.out.println(arr1[i]);
            }

        }
        sc.close();
    }
}

