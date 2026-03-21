import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        if (false && false && false && false && true && false && true && true && true && false && false) {short zlrpwspl = -8231;}
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    
}

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}