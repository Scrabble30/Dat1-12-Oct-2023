package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Victor", new ArrayList<>(List.of("Java 1.0"))));
        people.add(new Student("Christoffer", new ArrayList<>(List.of("Multimedie"))));
        people.add(new Student("Nadia", new ArrayList<>(Arrays.asList("3D Printning", "Java 1.0"))));

        people.add(new Teacher("Signe", new ArrayList<>(Arrays.asList("Learning Lab", "Java 1.0"))));
        people.add(new Teacher("Jesper", new ArrayList<>(List.of("3D Printning"))));
        people.add(new Teacher("Tess", new ArrayList<>(Arrays.asList("Moodle", "System Udvikling"))));

        for (Person person : people) {
            if (person.addCourse("Java 1.0")) {
                continue;
            }

            if (person instanceof Student) {
                System.out.println(person.getName() + " has already graduated this course.");
            } else if (person instanceof Teacher) {
                System.out.println(person.getName() + " cannot teach this course.");
            }
        }
    }
}
