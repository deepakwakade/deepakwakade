package ThirdProblem;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionCheck ec = new ExceptionCheck();
		int[] arr = {2,4,6,9};
		try {
			System.out.println("Sum of Array is : "+ec.sum(arr, 1, 10));
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
