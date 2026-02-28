import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d");  // MUTATED CODE
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }
}