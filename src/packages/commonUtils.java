package packages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class commonUtils {

    List<Integer> list = Arrays.asList(9, 3, 4, 2, 3, 0, 3, 2, 5, 4, 3, 2, 7, 5, 3, 4, 2, 5, 4, 8, 7, 9, 6, 5, 6, 4, 7,
            3, 8, 7, 1);

    List<Integer> list2 = Arrays.asList(9, 3, 4, 2, 3, 0, 3, 2, 5, 4, 3, 2, 7, 5, 3, 4, 2, 5, 4, 8, 7, 9, 6, 5, 6, 4, 7,
            3, 8, 7, 1);

    public Integer getLargestNumberByIndex(Integer indx) {
        Optional<Integer> integer = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(indx).findFirst();

        Map<Integer, Long> frequencyMap = list2.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        frequencyMap.forEach((key, value) -> System.out.println("Item: " + key + " Frequency: " + value));

        if (integer.isPresent()) {
            return integer.get();
        }
        return null;
    }
}
