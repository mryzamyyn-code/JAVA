import java.util.*;
import java.util.stream.Collectors;

public class task16 {

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("A", 20),
                new Student("B", 20),
                new Student("C", 21)
        );

        Map<Integer, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.age));

        System.out.println(grouped);
    }
}