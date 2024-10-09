package Chapter22;

class Box<T>{
    private T ob;
    public void set(T ob){
        this.ob = ob;
    }
    public T get(){
        return ob;
    }
}

class Toy extends Plastic{
    @Override
    public String toString(){
        return "I am a Toy.";
    }
}

class Plastic{

}

class BoxHandler{
    public static void outBox(Box<? extends Toy> box){
        box.get();
    }
    public static void inBox(Box<? super Toy> box, Plastic n){
        box.set(n);
        Toy t = box.get();
    }
}

public class BoundedWildcardBase {
    public static void main(String[] args){
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
