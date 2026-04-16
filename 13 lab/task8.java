import java.util.*;

public class task8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Lambda");

        words.stream()
            .filter(s -> s.length() > 5)
            .forEach(System.out::println);
    }
}