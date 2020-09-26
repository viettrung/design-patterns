package pattern.design.behavioral.memento;

public class MementoDemo {

	public static void main(String[] args) {

		CareTaker careTaker = new CareTaker();

		Employee emp = new Employee();
		emp.setName("Leonardo");
		emp.setAddress("123 de vinci");
		emp.setPhone("888-555-6789");

		System.out.println("Employee before save: " + emp);

		careTaker.save(emp);

		emp.setPhone("231-999-6789");

		careTaker.save(emp);

		System.out.println("Employee after change phone number save: " + emp);

		emp.setPhone("123-456-9999"); // <----- haven't called save!

		careTaker.revert(emp);

		System.out.println("Reverts to last save point: " + emp);

		careTaker.revert(emp);

		System.out.println("Reverted to original: " + emp);

	}

}
