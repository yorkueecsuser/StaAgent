import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}

// Dead Store Mutant
class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        int j = 0; // Dead store 
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}