import java.util.*;

public class task13 {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("A", 25),
                new Person("B", 20)
        );

        people.stream()
            .sorted(Comparator.comparing(p -> p.age))
            .forEach(p -> System.out.println(p.name));
    }
}