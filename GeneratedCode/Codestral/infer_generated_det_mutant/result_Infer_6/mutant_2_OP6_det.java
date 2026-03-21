import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        for  (int zfzxlhdc = 0; zfzxlhdc < 0; zfzxlhdc++) {String ybewnxgq = "rmrfgpoh";}
        stringInsteadOfInteger(out);
    
}
}