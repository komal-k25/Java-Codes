package unit2;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(3);
		
		names.add("First");
		names.add("Second");
		names.add("Fourth");
				
		System.out.println("Original Array List - " + names);
		System.out.println("Array List Size - " + names.size());
		
		names.add(2,"Third");
		
		System.out.println("New Array List - " + names);
		System.out.println("Array List Size - " + names.size());
		
		names.remove(3);
		
		System.out.println("Array List after Removing an element - " + names);
		
		System.out.println("First element: " + names.get(0));
		names.set(0, "abc");
		System.out.println("First element changed: " + names.get(0));
		
		System.out.println("New Array List - " + names);

	}
}
