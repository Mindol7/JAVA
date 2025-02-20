package Chapter34;

class Counter{
    int count = 0;

    public void increment(){
        count++;
    }

    public void decrement(){
        count--;
    }

    public int getCount(){
        return count;
    }
}

public class MutualAccess {
    public static Counter cnt = new Counter();
    public static void main(String[] args) throws InterruptedException{
        Runnable task1 = () -> {
            for(int i = 0; i < 1000; i++) cnt.increment();
        };

        Runnable task2 = () -> {
            for(int i = 0; i < 1000; i++) cnt.decrement();
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(cnt.getCount());
    }
}
