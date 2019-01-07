import java.util.Scanner;
class pro_2sum
{
	public static void main(String args[])
	{
		Scanner y = new Scanner (System.in);		
		System.out.println("enter intiger value");
		int x = y.nextInt();
		System.out.println("the enterd number is " + x);
		System.out.println("enter intiger value");	
		int z = y.nextInt();
		System.out.println("the enterd number is " + z);
		int s = x+z;
		System.out.println("the sum is " + s);
		y.close();
	}
}