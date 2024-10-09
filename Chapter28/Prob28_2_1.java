package Chapter28;

import java.util.function.BiFunction;

class Box<T, U>{
    private T id;
    private U con;
    public Box(T i, U c){
        id = i;
        con = c;
    }
    public void showIt(){
        System.out.println("ID: " + id + ", " + "Contents: " + con);
    }
}

public class Prob28_2_1 {
    public static void main(String[] args){
        BiFunction<Integer, String, Box<Integer, String>> bf = Box::new;
        BiFunction<Integer, String, Box<Integer, String>> bf2 = (a, b) -> new Box<>(a, b);
        
        Box<Integer, String> b1 = bf.apply(1, "Toy"); // 생성자가 와야함
        Box<Integer, String> b2 = bf.apply(2, "Robot");
        b1.showIt();
        b2.showIt();
    }
} // BiFunction<T, U, R> R apply(T t, U u)
