package generic.application;

import java.util.Arrays;

import generic.Person;

public class ComprableApp {

	public static void main(String[] args) {
		Person[] people = {
				new Person("Randy", "Jln. Suprapto IV"),
				new Person("Budi", "Jln aasd"),
				new Person("Felix", "Jln. Serdam"),
		};
		
		Arrays.sort(people);
		System.out.println(Arrays.toString(people));
	}

}
