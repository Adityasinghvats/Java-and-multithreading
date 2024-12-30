package Threads;

//Prevent race condition
class Counter{
    int count = 0;
//    Make sure one thread can only do at a time;
    public synchronized void counter(){
        count++;
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable object1 = () -> {
            for(int i=1;i<10000;i++){
                c.counter();
            }
        };
        Runnable object2 = () -> {
            for(int i=1;i<10000;i++){
                c.counter();
            }
        };

        Thread t1 = new Thread(object1);
        Thread t2 = new Thread(object1);

        t1.start();
        t2.start();

//        To run at the same time
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
