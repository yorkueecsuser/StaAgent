import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        for  (int pmczwjjq = 0; pmczwjjq < 0; pmczwjjq++) {char fewtdprj = 'o';}
        stringInsteadOfInteger(out);
    
}
}