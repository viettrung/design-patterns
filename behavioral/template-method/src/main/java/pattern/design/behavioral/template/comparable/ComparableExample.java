package pattern.design.behavioral.template.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {

		Person bryan = new Person("Bryan", 39, "123-456-7890");
		Person mark = new Person("Mark", 25, "666-456-0859");
		Person chris = new Person("Chris", 60, "648-968-0000");

		List<Person> people = new ArrayList<>();
		people.add(bryan);
		people.add(mark);
		people.add(chris);

		System.out.println(">>> Not sorted:");
		printContents(people);

		Collections.sort(people);

		System.out.println("\n>>> Sorted by age:");
		printContents(people);
	}

	private static void printContents(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}

}
