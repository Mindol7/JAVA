package Chapter29;

import java.util.List;
import java.util.Arrays;

class Box<T>{
    private T ob;
    public Box(T o){ ob = o;}
    public T get(){
        return ob;
    }
}

public class Prob29_1 {
    public static void main(String[] args){
        List<Box<String>> ls = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
        ls.stream().mapToInt(s -> s.get().length()).forEach(d -> System.out.println(d));
    }
}
