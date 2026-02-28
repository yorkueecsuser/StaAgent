import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}

// The mutant code is added immediately after the print statement
class PrintfArgsBugMutant1 {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}