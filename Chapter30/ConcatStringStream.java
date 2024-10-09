package Chapter30;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatStringStream {
    public static void main(String[] args){
        Stream<String> s1 = Stream.of("Cake", "Milk");
        Stream<String> s2 = Stream.of("Lemon", "Jelly");

        Stream.concat(s1, s2).forEach(s -> System.out.println(s));
    }
}
