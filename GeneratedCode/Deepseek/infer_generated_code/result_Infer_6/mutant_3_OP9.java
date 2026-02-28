import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        boolean loop = true;
        do {
            out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
            loop = false;
        } while(loop);
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }
}