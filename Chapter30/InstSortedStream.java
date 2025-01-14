package Chapter30;

import java.util.stream.Stream;

public class InstSortedStream {
    public static void main(String[] args){
        Stream.of("Box", "Apple", "Robot").sorted().forEach(s -> System.out.println(s + "\t"));
        System.out.println();

        Stream.of("Box", "Apple", "Robot").sorted((s1, s2) -> s1.length() - s2.length()).forEach(s -> System.out.println(s + "\t"));
        System.out.println();
    }
}
