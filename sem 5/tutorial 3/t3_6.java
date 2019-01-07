import java.util.*;
class t3_6
{
public static int a,e,i,o,u;
public static void main(String[] args)
{
Scanner Sc =new Scanner(System.in);
String s=new String();
while(true) 
{
int ta=0,te=0,ti=0,to=0,tu=0;
System.out.println("Enter A line :");
s=Sc.nextLine();
if(s.equals("quit"))
{
break;
}
else
{
int n=s.length()-1;
for(int x=0;x<=n;x++)
{
switch(s.charAt(x))
{
case 'a' : case 'A' : a++; ta++; break;
case 'e' : case 'E' : e++; te++;break;
case 'i' : case 'I' : i++;  ti++; break;
case 'o' : case 'O' : o++; to++; break;
case 'u' : case 'U' : u++; tu++; break;
}

}
System.out.println("\n\n In this statement:");
System.out.println("a ="+ta);
System.out.println("e ="+te);
System.out.println("i ="+ti);
System.out.println("o ="+to);
System.out.println("u ="+tu);
}
} 
System.out.println("\n\n Totle numbers of the vovels::");
System.out.println("a="+a);
System.out.println("e="+e);
System.out.println("i="+i);
System.out.println("o="+o);
System.out.println("u="+u);
Sc.close();
}
} 