package generic.application;

import java.util.Arrays;
import java.util.Comparator;

import generic.Person;

public class ComparatorApp {

	public static void main(String[] args) {
		Person[] people = {
				new Person("Randy", "Jln. Suprapto IV"),
				new Person("Budi", "Jln aasd"),
				new Person("Felix", "Jln. Serdam"),
		};
		
		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getName().compareTo(arg1.getName());
			}
		};
		
		Arrays.sort(people);
		
		System.out.println(Arrays.toString(people));
	}

}
