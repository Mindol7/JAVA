package Chapter27;

import java.util.function.BiConsumer;

class Box<T> {
    T ob;       
    public void set(T o) { 
        ob = o; 
    }
    public T get() { 
        return ob; 
    }
}

public class Prob27_4 {
    public static void main(String[] args){
        BiConsumer<Box<Integer>, Integer> c1 = (b, i) -> {
            b.set(i);
        };

        BiConsumer<Box<Double>, Double> c2 = (b, d) -> {
            b.set(d);
        };

        Box<Integer> bi = new Box<>();
        Box<Double> bd = new Box<>();

        c1.accept(bi, 10);
        c2.accept(bd, 7.5);

        System.out.println(bi.get());
        System.out.println(bd.get());
    }
}
