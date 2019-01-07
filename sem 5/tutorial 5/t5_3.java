abstract class shape
{
    abstract void area();
}
class triangle extends shape
{
    float a=12,b=9;
    void area()
    {
        System.out.println("area of triangle is " + (a/2)*b);
    }
}
class rectangle extends shape
{   
    int l=10,b=15;
    void area()
    {
        System.out.println("area of rectangle is "+ l*b);
    }
}
class circle extends shape
{
    int r=10;
    void area()
    {
        System.out.println("area of circle is "+ 3.14*r*r);
    }
}
class t5_3
{
    public static void main(String[] args)
    {
        triangle t = new triangle();
        t.area();
        circle c = new circle();
        c.area();
        rectangle r = new rectangle();
        r.area();
    }
}