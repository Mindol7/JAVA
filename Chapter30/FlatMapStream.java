package Chapter30;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapStream {
    public static void main(String[] args){
        Stream<String> ss1 = Stream.of("MY_AGE", "YOUR_LIFE");
        Stream<String> ss2 = ss1.flatMap(s -> Arrays.stream(s.split("_"))); // 데이터를 쪼갠다 -> 그룹을 스트림화 한다 -> 각 그룹을 묶는다.
        ss2.forEach(s -> System.out.print(s + "\t"));
        System.out.println();
    }
}
