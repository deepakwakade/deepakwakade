package com.thread;

public class MyThread2 extends Thread 
{
	
	public MyThread2()
	{
		super();
		
	}

	public MyThread2(String name)
	{
		super(name);
	
	}

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i*5);
			
		}
	}
}