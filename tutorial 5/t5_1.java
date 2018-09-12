abstract class vege
{
    public String color;
    abstract public String toString();
} 
class potato extends vege
{
    public String toString()
    {
        color = "white";
        return color;
    }
}
class tomato extends vege
{
    public String toString()
    {
        color = "red";
        return color;
    }
}
class brinjal extends vege
{
    public String toString()
    {
        color = "purple";
        return color;
    }
}
class t5_1
{
 public static void main(String[] args)
 {
     potato p = new potato();
     System.out.println("color of potato is " + p.toString());
     tomato t = new tomato();
     System.out.println("color of tomato is " + t.toString());
     brinjal b = new brinjal();
     System.out.println("color of brinjal is " + b.toString());

 }   
}