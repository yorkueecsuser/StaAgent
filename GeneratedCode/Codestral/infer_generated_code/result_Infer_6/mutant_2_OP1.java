import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        String deadStore = "unusedVariable"; // Dead Store mutation: Adding an unused variable declaration
        out.printf("Hello %d", "world");
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}