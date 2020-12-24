package generic;

public class Person implements Comparable<Person>{

	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public int compareTo(Person arg0) {
		return this.name.compareTo(this.name);
	}

	@Override
	public String toString() {
		return "Person{"
				+ "name='"+name+"' address='"+address+"' "
						+ "}";
	}
}
