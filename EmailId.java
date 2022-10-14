package FirstProblem;

public class EmailId {
	private String Email;

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) throws InvalidMailException{
		if (email.contains("@")&&email.contains(".")) {
			this.Email = email;
		}else {
			throw new InvalidMailException("Invalid Email.");
		}
		
	}

}
