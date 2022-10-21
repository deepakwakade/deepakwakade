package Thread.com;

public class InterThread {
	int amount=10000;    
	
	synchronized void Demand(int amount){    
		System.out.println("going to withdraw...");    	     
 }


	synchronized void Supply(int amount){    
		System.out.println("going to deposit...");    
		this.amount+=amount;    
		System.out.println("deposit completed... ");    
		notify();    
		}    
}
 

