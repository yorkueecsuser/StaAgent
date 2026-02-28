import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        String argument = "world"; // Duplicated assignment statement
        out.printf("Hello %d", argument);  // BUG: CHECKERS_PRINTF_ARGS
        out.printf("Duplicated Hello %s", argument); // Mutant code
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}