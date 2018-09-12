class Invalidtype extends RuntimeException
{
    private static final long serialVersionUID = 1L;

	Invalidtype(String msg)
    {
        System.out.println("Exception:- " + msg);
    }
}
class t6_3factorial
{
    public static void main(String[] args) 
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int f = 1;
        if(x>20 || y>20)
        {
            throw new Invalidtype("invalid range please enter in between 0 to 20 \n Both value should be between 0 to 20");
        }
        for(int i=1;i<=y;i++)
        {
         f=f*x;
        }
    System.out.println("x power y is = "+ f );
    }
}