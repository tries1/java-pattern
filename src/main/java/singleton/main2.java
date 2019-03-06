package singleton;

public class main2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ObjectCreateThread());
        Thread thread2 = new Thread(new ObjectCreateThread());
        Thread thread3 = new Thread(new ObjectCreateThread());
        Thread thread4 = new Thread(new ObjectCreateThread());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    /*public static void main(String[] args) {

        Thread newThread1 = new Thread(new ObjectCreateThread2());
        Thread newThread2 = new Thread(new ObjectCreateThread2());
        Thread newThread3 = new Thread(new ObjectCreateThread2());
        Thread newThread4 = new Thread(new ObjectCreateThread2());
        newThread1.start();
        newThread2.start();
        newThread3.start();
        newThread4.start();
    }
    */
}