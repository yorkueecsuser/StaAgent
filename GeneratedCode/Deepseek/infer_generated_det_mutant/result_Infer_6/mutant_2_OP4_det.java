import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        if (false && true && true && false && true && false && true && true && true && true && false) {String gtlccebi = "zjsztcss";}else{long zkjsfywn = 941578376;}
        stringInsteadOfInteger(System.out);
    
}
}