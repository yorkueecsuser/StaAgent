import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }

    public void mutantCode(PrintStream a) {  // Mutant Code
        a.printf("Hello %d", "world");  // Renamed 'out' to 'a'
    }
}