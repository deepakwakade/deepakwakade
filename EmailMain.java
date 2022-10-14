package FirstProblem;

public class EmailMain {

	public static void main(String[] args) {
		EmailId em = new EmailId();
		try {
			em.setEmail("deepakwakade511@gmail.com");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Mail ID : "+em.getEmail());
		

	}

}
