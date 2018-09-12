class t2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running...");
	}

	public static void main(String[] args)
	{
		t2 ob1=new t2();
		Thread t=new Thread(ob1);
		t.start();
		
	}
}	
