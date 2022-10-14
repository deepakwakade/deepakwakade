
public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.setName("Deepak");
		try {
			p.setAge(24);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			p.setContact("7499448041");
		}catch(Exception es) {
			System.out.println("Running"+es);
		}
		
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getContact());
	}

}
