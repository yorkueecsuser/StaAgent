import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        if (true && false && false && false && false && true && false && false && true && true && false) {char uumaiulc = 'q';}else{String vdvfmkxt = "pltdkahv";}
        stringInsteadOfInteger(out);
    
}
}