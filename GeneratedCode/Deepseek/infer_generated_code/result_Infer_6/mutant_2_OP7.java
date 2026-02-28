import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("Unreachable statement");
        }
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }
}