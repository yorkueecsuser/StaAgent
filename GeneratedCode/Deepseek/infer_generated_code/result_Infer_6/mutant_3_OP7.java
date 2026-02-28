import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    void unreachableWhileLoop(boolean unreachableCondition) {
        while(unreachableCondition) {
            // This code will not be executed because the condition is always false
        }
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
        unreachableWhileLoop(false);  // This unreachable while loop will never execute
    }
}