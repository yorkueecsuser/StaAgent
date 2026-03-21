import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        if (false && false && true && true && false && true && true && false && false && true && false) {int mdxacmsb = 522962276;}else{double wbkzpcsc = -824792121;}
        stringInsteadOfInteger(out);
    
}
}