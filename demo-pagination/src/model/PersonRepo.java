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
        persons.add(new Person("person 1", 1));
        persons.add(new Person("person 2", 2));
        persons.add(new Person("person 3", 3));
        persons.add(new Person("person 4", 4));
        persons.add(new Person("person 5", 5));
        persons.add(new Person("person 6", 6));
        persons.add(new Person("person 7", 7));
        persons.add(new Person("person 8", 8));
        persons.add(new Person("person 9", 9));
        persons.add(new Person("person 10", 10));
        persons.add(new Person("person 11", 11));
        persons.add(new Person("person 12", 12));
        persons.add(new Person("person 13", 13));

        return persons;
    }
}
