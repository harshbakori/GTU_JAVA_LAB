import java.util.Random;
class vovel
{
  public static void main(String []args)
  {
    Random Rn = new Random();
    Scanner y = new Scanner(System.in);
    System.out.println("enter the character");
    char s = y.next(".").charAt(0);
    if (s=='a'||s=='e'||s=='i'||s=='o'||s=='u') {
      System.out.println("*");
    }
    else{System.out.println("it is consolen");}
  }
}
