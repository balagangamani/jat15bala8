package javacollections;

import java.util.ArrayList;

public class ClearArrayList {

	public static void main(String[] args) {
		// Create an ArrayList of strings
		ArrayList<String> stringList = new ArrayList<>();

		// Add some strings to the ArrayList
		stringList.add("Hello");
		stringList.add("World");
		stringList.add("Java");

		// Print the ArrayList before removal
		System.out.println("ArrayList before removal: " + stringList);

		// Remove all elements from the ArrayList
		stringList.clear();

		// Print the ArrayList after removal
		System.out.println("ArrayList after removal: " + stringList);
	}

}
