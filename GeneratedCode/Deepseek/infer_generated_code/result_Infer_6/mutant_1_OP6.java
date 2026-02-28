import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    void unreachableForLoop() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            int x = 10;
        }
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
        unreachableForLoop();
    }
}