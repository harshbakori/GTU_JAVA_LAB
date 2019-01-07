import java.util.Scanner;
public class test3{
  public static void main(String[] args) {
    Scanner z = new Scanner(System.in);
    Scanner m = new Scanner(System.in);
    System.out.print("enter any no.");
    int y = z.nextInt();
    int x = z.nextInt();
    int a = x+y;
    System.out.println(a);
    String c = m.nextLine();
    System.out.println(c);
    if (x>=y) {
      System.out.println("xis equal to y or grater y");
    }
    else
    {System.out.print("y is big");}
  }
}
