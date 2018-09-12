//import java.util.Scanner;
//java aplication for calculate persantage marks of student for 6 subject
class pro_7studentmarkcmd
{
	public static void main(String args[])
	{

		int  sub[] = new int[args.length];
		//Scanner y = new Scanner (System.in);
		/*System.out.println("enter OOPJ marks");
		 sub[0] = y.nextInt();
System.out.println("enter cyber security marks");
		 sub[1] = y.nextInt();
System.out.println("enter SP marks");
		 sub[2] = y.nextInt();
System.out.println("enter CG marks");
		 sub[3] = y.nextInt();
System.out.println("enter ADA marks");
		 sub[4] = y.nextInt();
System.out.println("enter DE marks");
		 sub[5] = y.nextInt();*/
		int s=0,i;
		for (i=0;i<args.length;i++ ) {
				sub[i]=Integer.parseInt(args[i]);
				s=s+sub[i];
		}
		System.out.println("the total is = " + s);
		System.out.println("the avg is =" + (s/args.length) + "%");
		//y.close();
	}
}
