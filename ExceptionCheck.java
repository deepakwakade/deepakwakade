package ThirdProblem;

import java.util.Arrays;

public class ExceptionCheck {
	public int sum(int[] values,int start,int end) throws Exception{
		int count = 0;
		
		//IllegalArgumentException
		if(values.length==0) {
			throw new IllegalArgumentException("Length of Array is 0.");
		}
		
		//ArrayIndexOutOfBoundsException
		int max = Arrays.stream(values).max().getAsInt();
		int min = Arrays.stream(values).min().getAsInt();
		if(start>min||end<max) {
			throw new ArrayIndexOutOfBoundsException("Values in Array do not fall between "+start+" and "+end);
		}
		
		//calculating sum of array
		for(int i=0;i<values.length;i++) {
			count = count + values[i];
		}
		int total=0;
		//sumzero exception
		if(count==0) {
			throw new Exception("Sum of Array is zero.");
		}else {
			total = count;
		}
		
		
		return total;
	}
}
