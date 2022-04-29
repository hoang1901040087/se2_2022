package se2.tut10.act1;

public class Child extends Person{
	
	public Child(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void setAge(int age) throws IllegalArgumentException {
		if(age > 15) {
			throw new IllegalArgumentException("Child's age must be less than 15!");
		}
		
		super.setAge(age);
	}

	@Override
	public String toString() {
		return "Child [name=" + this.getName() + ", age=" + this.getAge() + "]";
	}

	
}
