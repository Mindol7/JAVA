package Chapter29;

import java.util.Arrays;

public class StringStream2 {
    public static void main(String[] args){
        String[] names = {"YOON", "LEE", "PARK"};
        // Arrays.stream(names).forEach(s -> System.out.println(s));
        Arrays.stream(names).forEach(System.out::println);
    }
}
