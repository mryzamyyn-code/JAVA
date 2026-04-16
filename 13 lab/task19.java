import java.util.*;

public class task19 {
    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );

        lists.stream()
            .flatMap(Collection::stream)
            .forEach(System.out::println);
    }
}