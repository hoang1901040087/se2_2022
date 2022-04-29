package se2.tut10.act1;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws IllegalArgumentException {
		if(name.length() <= 3) {
			throw new IllegalArgumentException("Name should have at least 3 character!");
		}
		this.name = name;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalArgumentException {
		if(age < 1) {
			throw new IllegalArgumentException("Age must be positive!");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
}
