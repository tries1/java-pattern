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

        if (printer == printer1) { System.out.println("print1 equal"); } else { System.out.println("print1 not equal"); }
        if (printer == printer2) { System.out.println("print2 equal"); } else { System.out.println("print2 not equal"); }
        if (printer == printer3) { System.out.println("print3 equal"); } else { System.out.println("print3 not equal"); }
        if (printer == printer4) { System.out.println("print4 equal"); } else { System.out.println("print4 not equal"); }
        if (printer == printer5) { System.out.println("print5 equal"); } else { System.out.println("print5 not equal"); }
        if (printer == printer6) { System.out.println("print6 equal"); } else { System.out.println("print6 not equal"); }
        if (printer == printer7) { System.out.println("print7 equal"); } else { System.out.println("print7 not equal"); }
        if (printer == printer8) { System.out.println("print8 equal"); } else { System.out.println("print8 not equal"); }
        if (printer == printer9) { System.out.println("print9 equal"); } else { System.out.println("print9 not equal"); }
        if (printer == printer10) { System.out.println("print10 equal"); } else { System.out.println("print10 not equal"); }
        /*for (int i = 0; i < 10; i++) {
        }*/
    }
}