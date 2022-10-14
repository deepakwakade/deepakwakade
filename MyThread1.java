package com.thread;

public class MyThread1 extends Thread 
{
	
	public MyThread1()
	{
		super();
		
	}

	public MyThread1(String name)
	{
		super(name);
	
	}

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i*2);
			
		}
	}
}