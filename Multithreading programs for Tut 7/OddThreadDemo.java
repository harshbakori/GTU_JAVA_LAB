class OddNumThread implements Runnable
{
	public void run()
	{
		System.out.print("Odd Numbers");
		for(int i=0;i<100;i++)
		{
			if(i%2!=0)
				System.out.print(i+ " ");
		}
	}
}
class EvenNumThread implements Runnable
{
	public void run()
	{
		System.out.print("Even Numbers");
		for(int i=0;i<100;i++)
		{
			if(i%2==0)
				System.out.print(i+ " ");
		}
	}
}

class OddThreadDemo
{
	public static void main(String[] args)
	{
		//OddNumThread ob1 = new OddNumThread();
		Thread t1= new Thread(new OddNumThread());
		Thread t2= new Thread(new EvenNumThread());
		t1.start();
		t2.start();
	}
}	