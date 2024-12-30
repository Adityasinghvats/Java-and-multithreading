package Threads;
//class Greet3 implements Runnable{
//    public void run(){
//        for(int i=1;i<100;i++){
//            System.out.println("Executed thread 1");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

import java.io.InputStream;
import java.util.Scanner;

class Greet4 implements Runnable{
//    interface runnable is implemented
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
public class RunnableEg {
    public static void main(String[] args) {

//        Making a runnable object using lambda
        Runnable obj1 = () -> {
            for(int i=1;i<100;i++){
                System.out.println("Executed thread 1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable obj2 = new Greet4();

        Runnable object3 = () -> {
           for(int i=1;i<5;i++){
               System.out.println("Thread 3 lambda");
           }
        };

//        Thread has many constructors , one of them take a runnable object
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(object3);

        t1.start();
        t2.start();
        t3.start();
    }
}
