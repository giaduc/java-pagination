package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giaduc
 */
public class PersonRepo {

    public static List<Person> getAll() {
        List<Person> persons;
        persons = new ArrayList<>();
        persons.add(new Person("person 1", 0));
        persons.add(new Person("person 2", 0));
        persons.add(new Person("person 3", 0));
        persons.add(new Person("person 5", 0));
        persons.add(new Person("person 6", 0));
        persons.add(new Person("person 7", 0));
        persons.add(new Person("person 8", 0));
        persons.add(new Person("person 9", 0));
        persons.add(new Person("person 10", 0));
        persons.add(new Person("person 11", 0));
        persons.add(new Person("person 12", 0));
        persons.add(new Person("person 13", 0));
        persons.add(new Person("person 14", 0));

        return persons;
    }
}
