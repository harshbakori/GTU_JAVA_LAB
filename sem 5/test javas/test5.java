import java.util.Scanner;
public class test5{
  public static void main(String[] args) {
 
   Scanner z =new Scanner(System.in);
    int[] a = new int[5];
    int i=0;
    while (i<5)
    {
    System.out.println("enter letter " + i);
    a[i] = z.nextInt();
    i++;
    }
int q=0;
while(q < 5 ){
System.out.println(a[q]);
q++;
	}
	System.out.println("in for");
for(q=0; q < 5; q++){System.out.print(a[q]);}
}
}
