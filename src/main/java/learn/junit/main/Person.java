package learn.junit.main;

import java.util.Comparator;

public class Person implements Comparator<Person>, Comparable<Person> {
	
	private String name;
	private int age;
	
	
	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}

	@Override
	public int compareTo(Person o) {
		
		return 0;
	}

}
