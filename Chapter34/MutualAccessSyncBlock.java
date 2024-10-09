package Chapter34;

class Counter{
    int count = 0;
    public void increment(){
        synchronized(this){
            count++;
        }
    }
    public void decrement(){
        synchronized(this){
            count--;
        }
    }

    public int getCount(){
        return count;
    }
}

public class MutualAccessSyncBlock {
    public static Counter count = new Counter();
    public static void main(String[] args) throws InterruptedException{
        Runnable task1 = () -> {
            for(int i = 0; i < 1000; i++){
                count.increment();
            }
        };

        Runnable task2 = () -> {
            for(int i = 0; i < 1000; i++){
                count.decrement();
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count : " + count.getCount());
    }
}
