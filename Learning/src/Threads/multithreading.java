package Threads;
class Greet1 extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Executed thread 1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Greet2 extends Thread{
//    start() method calls run() so we need to make it explicitly
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Executed thread 2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        Greet1 ob1 = new Greet1();
        Greet2 ob2 = new Greet2();

//        Start is method from thread class ,it gives a new thread with each call
        ob1.start();
        ob2.start();

//        Output has some hi and some hello ,so we can say
//        it is executing in parallel

//        Priority goes from 1 to 10
//        By default have 5
//        System.out.println(ob1.getPriority());
//        ob1.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(ob1.getPriority());
    }
}
