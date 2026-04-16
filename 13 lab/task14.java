import java.util.*;

public class task14 {

    static class Student {
        String name;
        int age;
        double grade;

        Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ali", 20, 85),
                new Student("Dana", 19, 75),
                new Student("Max", 21, 90)
        );

        students.stream()
            .filter(s -> s.grade > 80)
            .sorted(Comparator.comparing(s -> s.name))
            .forEach(s -> System.out.println(s.name));
    }
}