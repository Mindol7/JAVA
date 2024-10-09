package Chapter28;

import java.util.Optional;

public class OptionalFlatMap {
    public static void main(String[] args){
        Optional<String> os1 = Optional.of("Optional String");
        Optional<String> os2 = os1.map(s -> s.toUpperCase());
        System.out.println(os2.get());

        Optional<Optional<String>> os3 = os1.map(s -> Optional.of(s.toLowerCase()));
        System.out.println(os3.get().get());
    }
}
