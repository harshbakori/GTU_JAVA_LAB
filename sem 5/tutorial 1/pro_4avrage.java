//java aplication for calculate persantage marks of student for 6 subject
import java.util.Scanner;
class pro_4avrage
{
	public static void main(String args[])
	{
		Scanner y = new Scanner (System.in);		
		System.out.println("enter OOPJ marks");
		int x = y.nextInt();
System.out.println("enter cyber security marks");
		int d = y.nextInt();
System.out.println("enter SP marks");
		int z = y.nextInt();
System.out.println("enter CG marks");
		int a = y.nextInt();
System.out.println("enter ADA marks");
		int b = y.nextInt();
System.out.println("enter DE marks");
		int c = y.nextInt();
		int s = x+d+z+a+b+c;
System.out.println("the total is = " + s);
		System.out.println("the avg is =" + (s/6) + "%");
		y.close();
	}
}