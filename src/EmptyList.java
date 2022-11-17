// Adding an Element at Particular
// Index in Java ArrayList
import java.io.*;
import java.util.ArrayList;

class EmptyList{

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Adding elements to ArrayList
		// using add method for String ArrayList
		list.add("A");
		list.add("B");
		list.add("C");

		/* Index is zero based */

		// 3 gets added to the 1st position
		list.add(1, "D");

		// 4 gets added to the 2nd(position)
		list.add(2, "E");

		// Displaying elements in ArrayList
		System.out.println(list);
	}
}
