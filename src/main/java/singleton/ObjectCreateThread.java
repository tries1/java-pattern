package singleton;

public class ObjectCreateThread implements Runnable {
    @Override
    public void run() {
        Printer2 printer = Printer2.getInstance();
        printer.number++;

        System.out.println(printer.number);
    }
}
