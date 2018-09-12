public class test7
{
	public static void main(String[] args)
	{
		student mark = new student();//object or instance
		mark.getid(1);
		mark.name = "harsh";
		mark.age = 15;
		
	System.out.println(mark.id + " name is " + mark.name + " age is " + mark.age );
			
		student mark1 = new student();//object or instance
		mark1.id = 2;
		mark1.name = "jeet";
		mark1.age = 14;
		
	System.out.println(mark1.id + " name is " + mark1.name + " age is " + mark1.age );
	}
}