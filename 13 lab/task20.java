import java.util.*;

public class task20 {
    public static void main(String[] args) {
        List<Integer> orders = Arrays.asList(500, 2000, 1500, 700);

        orders.stream()
            .filter(o -> o > 1000)
            .sorted()
            .forEach(System.out::println);
    }
}