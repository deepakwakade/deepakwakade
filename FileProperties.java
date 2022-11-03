package iostream.com;
import java.io.File;

public class FileProperties {
	

	    public static void main(String args[])
	    {
	        File file = new File("D:/Users/Sushil");
	        
	        System.out.println("file is readible : " +file);
	        System.out.println("file is writable : " +file);
	        System.out.println("file length : " +file.length());


	        
	        String[] fileList = file.list();
	        for(String name:fileList)
	        {
	            System.out.println(name);
	        }
	    }

}