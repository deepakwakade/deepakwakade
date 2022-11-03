 print to console whose name starts with "A". 
     (Student---id,name,contact); 
*/
package iostream.com;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	
	    public static void main(String[] args)
	    {
	 
	        try {
	 
	        	// Creating a Fileread object
	            FileReader fr = new FileReader("student.txt");
	            String str = "A";
	 
	            // Creating a FileWriter object
	            FileWriter fw = new FileWriter("student.txt");
	           
	 
	            int i;
	            while ((i = fr.read()) != -1) {
	                str += (char)i;
	            }
	 
	           
	            System.out.println(str);
	 
	            fw.write(str);
	 
	            
	            fr.close(); // close read file
	            fw.close(); // close write file
	 
	            // Display message
	            System.out.println(
	                "File reading and writing both done");
	        }
	        catch (IOException e) {
	 
	           
	            System.out.println(
	                "There are some IOException");
	        }
	    }
	}