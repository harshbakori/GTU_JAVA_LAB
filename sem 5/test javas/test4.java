import java.util.Scanner;
public class test4{
  public static void main(String[] args) {
    System.out.println("enter 1 for sum \n 2 for multiply");
    Scanner z =new Scanner(System.in);
    int a = z.nextInt();
    System.out.println("enter two no: ");
    int x = z.nextInt();
    int y = z.nextInt();
    switch(a)
    {
      case 1:
            System.out.println("sum is" + (x + y));
            break;
      case 2:
            System.out.println(x*y);
    }

  do{
    x++;
    System.out.println(x);}
    while(x<10);
  }
}
