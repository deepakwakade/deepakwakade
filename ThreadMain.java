package com.thread;

public class ThreadMain 
{
	public static void main(String...args)
	{
		MyThread2 th2=new MyThread2("Thread02");
		Runnable R1=new MyThread1();
		Thread th1=new Thread(R1,"Thread01");
					
		th1.setPriority(3);
		th2.setPriority(7);
		
		th1.start();
		th2.start();
		
	}
}