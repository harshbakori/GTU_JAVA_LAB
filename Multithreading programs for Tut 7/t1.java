class OddNumThread extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
}
class OddThreadDemo
{
	public static void main(String[] args)
	{
		OddNumThread ob1 = new OddNumThread();
		ob1.start();
						
	}
}	