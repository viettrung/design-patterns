package pattern.design.behavioral.template.comparable;

public class Person implements Comparable<Person> {

	private String name;
	private int age;
	private String phoneNumber;

	public Person(String name, int age, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int compareTo(Person o) {

		if (this.getAge() > o.getAge()) {
			return 1;
		}
		if (this.getAge() < o.getAge()) {
			return -1;
		}
		return 0;
	}

}
