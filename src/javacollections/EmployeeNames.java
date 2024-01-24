package javacollections;

import java.util.TreeMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeNames {

	public static void main(String[] args) {
		// Create a TreeMap of employee IDs (Integer) and names (String)
		TreeMap<Integer, String> employees = new TreeMap<>();

		// Add some employees to the TreeMap
		employees.put(1001, "Abhishek");
		employees.put(1002, "Reenath");
		employees.put(1003, "Shivani");
		employees.put(1004, "Bala");

		// Extract the names into a list
		List<String> names = new ArrayList<>(employees.values());

		// Sort the names in alphabetical order
		Collections.sort(names);

		// Print out the names in alphabetical order
		System.out.println("Employees names in alphabetical order:");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
