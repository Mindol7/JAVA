package Chapter27;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateDemo {
    public static int sum(Predicate<Integer> p, List<Integer> list){
        int s = 0;
        for(int n : list){
            if(p.test(n)) s += n;
        }
        return s;
    }
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 5, 7, 9, 11, 12);
        int s;
        s = sum(n -> n%2 == 0, list);
        System.out.println("짝수의 합 : " + s);

        s = sum(n -> n%2 != 0, list);
        System.out.println("홀수의 합 : " + s);
    }
}
