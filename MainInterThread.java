package Thread.com;

public class MainInterThread {
	   
	public static void main(String args[]){    
	final InterThread it=new InterThread();    
	new Thread(){    
	public void run(){
		it.Demand(15000);}    
	}
	
	.start();    
	new Thread(){    
	public void run(){it.Supply(10000);}    
	}
	
	.start();    
	    
	}
}
