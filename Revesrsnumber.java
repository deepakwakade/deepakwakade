package Thread.com;

public class Revesrsnumber extends Thread {
	
	 public void run()
     {
   
               System.out.println("\nReverse is: ");
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+"  ");
               }
               System.out.println("\n");
          }
         
     }

