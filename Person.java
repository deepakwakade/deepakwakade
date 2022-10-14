import java.util.Scanner;
import java.util.regex.Pattern;
public class Person {
	String name;
	int Age;
	String Contact;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) throws InvalidAgeException{
		if (age<15 || age>50) {
			throw new InvalidAgeException("Invalid Age..");
		}this.Age=age;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) throws InvalidContactException{
		boolean check = Pattern.matches("[789]{1}\\d{9}",contact);
		if(check==false){
			throw new InvalidContactException("Invalid Contact...");
		}this.Contact=contact;
	}

}
