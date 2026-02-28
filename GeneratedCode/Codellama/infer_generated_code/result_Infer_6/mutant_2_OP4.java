import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}

// Unreachable if-else statement mutation
boolean condition = getCondition();
if (condition) {
    // Do nothing
} else {
    out.printf("Hello %d", "world");
}