import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        boolean xnnhpjmw = false;while (xnnhpjmw && true && true && false && true && true && true && true && false && true && false && false) {byte txwhvtwv = -32;}
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    
}

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}