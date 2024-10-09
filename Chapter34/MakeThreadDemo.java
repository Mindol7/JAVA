package Chapter34;

public class MakeThreadDemo {
    public static void main(String[] args){
        Runnable task = () -> { // Runnable Instance Implements
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (n1 + n2));
        };

        Thread t = new Thread(task); // Transfer Thread task to Thread Instance.
        t.start(); // Start Method
        System.out.println("End " + Thread.currentThread().getName());
    }
}
