package singleton;

public class ObjectCreateThread2 implements Runnable {
    @Override
    public void run() {
        Printer print = Printer.getInstance2();

        System.out.println(++print.number);
    }
}
