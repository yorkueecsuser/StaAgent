import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    boolean getCondition() { 
        return false; 
    }

    void showBug() {
        boolean condition = getCondition();
        if (condition) {
            stringInsteadOfInteger(System.out);
        } else {
            // Unreachable code branch 
        }
    }
}