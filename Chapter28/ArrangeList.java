package Chapter28;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class ArrangeList {
    public static void main(String[] args){
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);

        // Consumer<List<Integer>> c = l -> Collections.reverse(l);
        Consumer<List<Integer>> c2 = Collections::reverse;
        c2.accept(ls);
        System.out.println(ls);
    }
}
