package javacollections;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// Create a List
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Carrot");
		list.add("Dates");

		// Convert List to Array
		String[] array = list.toArray(new String[0]);

		// Output the array
		System.out.println("Array elements:");
		for (String element : array) {
			System.out.println(element);
		}
	}
}
