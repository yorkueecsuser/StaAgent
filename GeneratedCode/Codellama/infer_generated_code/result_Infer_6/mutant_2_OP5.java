import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
        switch (false) {
        case true:
            System.out.println("Reachable code");
        default:
            System.out.println("Unreachable code");
        }
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}