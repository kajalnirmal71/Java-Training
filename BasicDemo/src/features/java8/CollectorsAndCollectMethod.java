package features.java8;
import java.util.*;
import java.util.stream.*;

public class CollectorsAndCollectMethod {

        public static void main(String[] args) {

            List<String> names = Arrays.asList("Amit", "Kajal", "Raj", "Neha", "Amit");
            List<Integer> marks = Arrays.asList(85, 92, 60, 70, 85);

            // 1. toList()
            List<String> nameList = names.stream().collect(Collectors.toList());
            System.out.println("toList(): " + nameList);

            // 2. toSet()
            Set<String> nameSet = names.stream().collect(Collectors.toSet());
            System.out.println("toSet(): " + nameSet);

            // 3. joining()
            String joinedNames = names.stream().collect(Collectors.joining(", "));
            System.out.println("joining(): " + joinedNames);

            // 4. counting()
            long totalNames = names.stream().collect(Collectors.counting());
            System.out.println("counting(): " + totalNames);

            // 5. summarizingInt()
            IntSummaryStatistics stats = marks.stream().collect(Collectors.summarizingInt(Integer::intValue));
            System.out.println("summarizingInt(): " + stats);

            // 6. toMap() - name to mark (first 4 entries)
            Map<String, Integer> nameToMark = IntStream.range(0, 4)
                    .boxed()
                    .collect(Collectors.toMap(i -> names.get(i), i -> marks.get(i)));
            System.out.println("toMap(): " + nameToMark);

            // 7. groupingBy() - group names by length
            Map<Integer, List<String>> groupedByLength = names.stream()
                    .collect(Collectors.groupingBy(String::length));
            System.out.println("groupingBy(): " + groupedByLength);

            // 8. partitioningBy() - names starting with 'A'
            Map<Boolean, List<String>> partitioned = names.stream()
                    .collect(Collectors.partitioningBy(name -> name.startsWith("A")));
            System.out.println("partitioningBy(): " + partitioned);

            // 9. mapping() - upper case names grouped by length
            Map<Integer, List<String>> upperNamesByLength = names.stream()
                    .collect(Collectors.groupingBy(
                            String::length,
                            Collectors.mapping(String::toUpperCase, Collectors.toList())
                    ));
            System.out.println("mapping(): " + upperNamesByLength);
        }
    }


