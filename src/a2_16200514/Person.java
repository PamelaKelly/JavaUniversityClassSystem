package a2_16200514;

public class Person {
	private Name name;
	private Address address;
	
	public Person (Name name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public Name getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "name: " + name.toString() + "\naddress: " + address.toString();
	}
}

