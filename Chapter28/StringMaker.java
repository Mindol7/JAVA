package Chapter28;

import java.util.function.Function;

public class StringMaker {
    public static void main(String[] args){
        // Function<char[], String> f = ar -> {
        //     return new String(ar);
        // };
        Function<char[], String> f2 = String::new;

        char[] src = {'R', 'o', 'b', 'o', 't'};
        String str = f2.apply(src);
        System.out.println(str);
    }
} // Function<T, R> R apply(T t)
