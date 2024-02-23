package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Person1 implements Comparable<Person1> { // Use Person1, not Person
    String name;
    String email;

    public Person1(String name, String email) {
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
    public int compareTo(Person1 person) { // Use Person1, not Person
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
        // You should provide a proper hashCode implementation based on your data.
        return Objects.hash(name, email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person1 p = (Person1) obj;
        return this.name.equals(p.name) && this.email.equals(p.email);
    }
}

public class Persons {
    public static void main(String[] args) {
        HashSet<Person1> personHashSet = new HashSet<>();
        personHashSet.add(new Person1("vijay", "1@example.com"));
        personHashSet.add(new Person1("vijay", "1@example.com"));
        personHashSet.add(new Person1("kumar", "2@example.com"));

        System.out.println("HashSet:");
        for (Person1 person : personHashSet) {
            System.out.println(person);
        }

        TreeSet<Person1> personTreeSet = new TreeSet<>(personHashSet);
        System.out.println("\nTreeSet:");
        for (Person1 person : personTreeSet) {
            System.out.println(person);
        }
    }
}
