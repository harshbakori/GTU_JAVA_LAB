interface transport
{
    void deliver();
}
abstract class animal
{
    abstract void show();
}
class tiger extends animal
{
    void show(){}
}
class camel extends animal implements transport
{
    void show()
    {
        deliver();
    }
    public void deliver()
    {
        System.out.println("delivery of camel");
    }
}
class deer extends animal
{
    void show(){}
}
class donkey extends animal implements transport
{
    void show()
    {
        deliver();
    }
    public void deliver()
    {
        System.out.println("delivery of donkey");
    }
}
class t5_2
{
    public static void main(String[] args)
    {
        animal[] a = new animal[4];
        a[0]=new tiger();
        a[1]=new deer();
        a[2]=new camel();
        a[3]=new donkey();
        for( int i=0;i<a.length;i++)
        {
            if(a[i]instanceof transport)
            {
                a[i].show();
            }
        }
    }
}