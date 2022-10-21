
package Thread.com;

public class SyncronizedThread {

	 public static void main(String[] args)
     {
         
               FibonacciSerise fis = new FibonacciSerise();
               Revesrsnumber rev = new Revesrsnumber();
               
               fis.start();
               rev.start();
          }
          
     }