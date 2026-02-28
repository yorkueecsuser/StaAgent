import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        do {
            out.printf("Hello %d", "world");
        } while (true);
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}