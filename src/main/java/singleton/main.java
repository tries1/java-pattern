package singleton;

public class main {
    public static void main(String[] args) {
        Printer printer = Printer.getInstance();
        Printer printer1 = Printer.getInstance();
        Printer printer2 = Printer.getInstance();
        Printer printer3 = Printer.getInstance();
        Printer printer4 = Printer.getInstance();
        Printer printer5 = Printer.getInstance();
        Printer printer6 = Printer.getInstance();
        Printer printer7 = Printer.getInstance();
        Printer printer8 = Printer.getInstance();
        Printer printer9 = Printer.getInstance();
        Printer printer10 = Printer.getInstance();

        /*if (printer == printer1) { System.out.println("print1 equal"); } else { System.out.println("print1 not equal"); }
        if (printer == printer2) { System.out.println("print2 equal"); } else { System.out.println("print2 not equal"); }
        if (printer == printer3) { System.out.println("print3 equal"); } else { System.out.println("print3 not equal"); }
        if (printer == printer4) { System.out.println("print4 equal"); } else { System.out.println("print4 not equal"); }
        if (printer == printer5) { System.out.println("print5 equal"); } else { System.out.println("print5 not equal"); }
        if (printer == printer6) { System.out.println("print6 equal"); } else { System.out.println("print6 not equal"); }
        if (printer == printer7) { System.out.println("print7 equal"); } else { System.out.println("print7 not equal"); }
        if (printer == printer8) { System.out.println("print8 equal"); } else { System.out.println("print8 not equal"); }
        if (printer == printer9) { System.out.println("print9 equal"); } else { System.out.println("print9 not equal"); }
        if (printer == printer10) { System.out.println("print10 equal"); } else { System.out.println("print10 not equal"); }*/
        /*for (int i = 0; i < 10; i++) {
        }*/

       /* System.out.println(printer.number);
        System.out.println(printer1.number);
        System.out.println(printer2.number);
        System.out.println(printer3.number);
        System.out.println(printer4.number);
        System.out.println(printer5.number);
        System.out.println(printer6.number);
        System.out.println(printer7.number);
        System.out.println(printer8.number);
        System.out.println(printer9.number);
        System.out.println(printer10.number);*/

        System.out.println("========================================");

        //불변성 문제?
        //이미 객체를 가져간후 print한듯
        Thread newThread1 = new Thread(new ObjectCreateThread2());
        Thread newThread2 = new Thread(new ObjectCreateThread2());
        Thread newThread3 = new Thread(new ObjectCreateThread2());
        Thread newThread4 = new Thread(new ObjectCreateThread2());


        newThread1.start();
        //sleep(1000);
        newThread2.start();
        //sleep(1000);
        newThread3.start();
        //sleep(1000);
        newThread4.start();
    }

    public static void sleep(int sec){
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}