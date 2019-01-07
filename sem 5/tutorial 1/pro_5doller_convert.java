// 68.69Rs = 1$  converts doler intu INR
import java.util.Scanner;
class pro_5doller_convert
{
public static void main(String[] args)
{
	System.out.println("enter Rupees value");
	Scanner y = new Scanner(System.in);
	double dol = y.nextDouble();
	double R = dol*68.69;
	System.out.println("the doler is = " + R );
	y.close();
}
}