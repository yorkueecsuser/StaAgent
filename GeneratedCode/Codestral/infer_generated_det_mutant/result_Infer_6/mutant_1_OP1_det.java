import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        int tgermiqw = -501373987;
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    
}

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}