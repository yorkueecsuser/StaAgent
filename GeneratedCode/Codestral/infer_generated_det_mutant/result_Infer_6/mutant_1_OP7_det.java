import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        boolean xmbdpvqy = false;while (xmbdpvqy && true && false && false && true && true && true && false && true && true && true && false) {String ekuolhrv = "mnzkkrpt";}
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    
}

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}