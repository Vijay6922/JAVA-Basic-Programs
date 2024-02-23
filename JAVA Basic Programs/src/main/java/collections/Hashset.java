package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	String email;

	public Person(String name, String email) {

		this.name = name;
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	@Override
	public int compareTo(Person person) {
		if (this.name.equals(person.name) && this.email.equals(person.email)) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if (this.name.equals(p.name) && this.email.equals(p.email)) {
			return true;
		} else {
			return false;
		}
	}
}

public class Hashset {

	public static void main(String[] args) {
		HashSet<Person> personHashSet = new HashSet<>();
		personHashSet.add(new Person("vijay", "1@example.com"));
		personHashSet.add(new Person("vijay", "1@example.com"));
		personHashSet.add(new Person("kumar", "2@example.com"));

		System.out.println("HashSet:");
		for (Person person : personHashSet) {
			System.out.println(person);
		}

		TreeSet<Person> personTreeSet = new TreeSet<>(personHashSet);
		System.out.println("\nTreeSet:");
		for (Person person : personTreeSet) {
			System.out.println(person);
		}

	}

}