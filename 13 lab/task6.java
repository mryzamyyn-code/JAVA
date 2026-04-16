import java.util.*;

public class task6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");

        words.stream()
            .sorted((a, b) -> a.length() - b.length())
            .forEach(System.out::println);
    }
}