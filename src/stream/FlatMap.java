package stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

    }

    public static List<String> transform(List<List<String>> collection) {
        return collection.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
