import java.util.*;

public class task5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int max = list.stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println(max);
    }
}