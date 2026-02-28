import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }

    // Unreachable for loop
    public static void unreachableLoop(int value) {
        for (int i = 0; false; i++) {
            // Do nothing
        }
    }
}