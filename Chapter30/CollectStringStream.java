package Chapter30;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectStringStream {
    public static void main(String[] args){
        String[] words = {"Hello", "Box", "Robot", "Toyrrrrrr"};

        Stream<String> ss = Arrays.stream(words);

        List<String> ls = ss.parallel().filter(s -> s.length() > 4).collect(() -> new ArrayList<>(), (c, s) -> c.add(s), (lst1, lst2) -> lst1.addAll(lst2));
        // 병렬 처리를 한다. -> 필터한다. -> 저장소를 만들고, 그 저장소에 저장하고, 합친다.
        System.out.println(ls);
    }
}
