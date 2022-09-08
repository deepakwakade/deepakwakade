//WAP to perform operations (+,-,*,/,%)on two numbers using switch case.
public class SwitchCase {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		char a;
		  switch(a='+')
		 {
		      case '+': System.out.println("addition of two number is "+(i+j));
		               break;
		      case '-': System.out.println("substraction of two number is "+(i-j));
		               break;
		      case '*': System.out.println("multilication of two number is "+(i*j));
		               break;
		      case '/': System.out.println("division of two number is "+(i/j));
		               break;
		      case '%': System.out.println("module of two number is "+(i%j));
		               break;
		      default: System.out.println("invalid Operator");
		               break;
		  }
	}
		
	}


