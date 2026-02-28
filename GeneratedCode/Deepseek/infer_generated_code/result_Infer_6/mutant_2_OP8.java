import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }

    void mutatedStringInsteadOfInteger(PrintStream out) {
        String myString = "world";
        out.printf("Hello %d", myString);
    }

    public void showMutatedBug() {
        mutatedStringInsteadOfInteger(System.out);
    }
}