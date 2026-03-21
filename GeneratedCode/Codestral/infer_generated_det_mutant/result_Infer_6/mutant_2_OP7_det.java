import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        boolean autbcbmk = false;while (autbcbmk && true && true && false && false && false && true && true && true && false && false && false) {int mjygrtbf = 602386165;}
        stringInsteadOfInteger(out);
    
}
}