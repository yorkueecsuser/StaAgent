import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        if (true && true && false && true && true && true && true && false && false && true && false) {String pdclohbs = "yvkejnit";}
        stringInsteadOfInteger(out);
    
}
}