import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }

    // Dead Store (insert unused variable declaration)
    public static void newMethod() {
        int x = 10;
        stringInsteadOfInteger(System.out);
    }
}