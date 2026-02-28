import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }
    
    void stringInsteadOfIntegerMutantRenamed(PrintStream p) {
        p.printf("Hello %d", "world");  // Mutant: Renamed variable `out` to `p`
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
        stringInsteadOfIntegerMutantRenamed(System.out);  // Check for Unreachable statement error - Removed for clarity
    }
}