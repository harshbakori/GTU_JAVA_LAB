class year extends RuntimeException
{
    year(String msg)
    {
        System.out.println("Enter year between 1980 to 2018");
    }
}
class month extends RuntimeException
{
    month(String msg)
    {
        System.out.println("Enter month between 1 to 12");
    }
}
class date extends RuntimeException
{
    date(String msg)
    {
        System.out.println("Enter date between 1 to 31");
    }
    date(int a)
    {
        System.out.println("Enter valid date for leapyear");
    }
}
class t6_2monthdate 
{
    public static void main(String[] args) 
    {
        int d,m,y;
        d=Integer.parseInt(args[0]);
        m=Integer.parseInt(args[1]);
        y=Integer.parseInt(args[2]);

        if(y<1980 || y>2018)
        {
            throw new year("\n invalid year");
        }
        if(m<1||m>12)
        {
            throw new month("\n invalid month");
        }
        if(m!=0)
        {
            if(d<0||d>31)
            {
            throw new date("\n invalid date");
            }
        }
        if(m%2==0 && m!=2)
        {
            if(d<0||d>30)
            {
            throw new date("\n invalid date");
            }
        }
        if(y%4==0 && m==2)      // leap year month = 2
        {   
            if(d>29||d<0)
            {
                throw new date(1);
            }
        }
        if(y%4!=0 && m==2) // not leap yer month =2
        {
            if(d>28||d<0)       
                throw new date(1);
        }
        System.out.println("You have entered valid date");

    }
}