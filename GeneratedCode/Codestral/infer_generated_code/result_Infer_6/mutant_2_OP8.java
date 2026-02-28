import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        String a = "world"; // Mutant code: Renaming 'world' to 'a'
        out.printf("Hello %d", a);
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}