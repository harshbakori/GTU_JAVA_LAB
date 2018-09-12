//java program that floting point variable initilized with the $ value for your income.and a second floating piont variable initialized with value of text rate of 35%.
//calculate and output amount of text use two different variableof type int
import java.util.Scanner;
class texpayment
{
public static void main(String []args)
{
	System.out.println("enter income value");
	Scanner y = new Scanner(System.in);
	float income = y.nextFloat();
//	float rupe = income/(float)68.57;
	System.out.println("the income incdoler is = " + income );
	float tex = (float)0.35*income;
	System.out.println("the tex is = " + tex );
	tex = tex*(float)68.57;
	System.out.println("the tex in INR is = " + tex);
	//String texs = String.valueOf(tex);
	//System.out.println(" the " + texs);
	int rup = (int)tex;
	int pais = (int)((tex-rup)*100);
	System.out.println(" rupies are = " + rup + "paisa = " + pais);  
	y.close();
}
}
