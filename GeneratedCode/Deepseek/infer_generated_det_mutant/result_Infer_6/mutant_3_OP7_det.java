import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        boolean uyxzciuz = false;while (uyxzciuz && true && true && false && true && true && false && true && true && true && true && false) {short ftaagqkh = 387;}
        stringInsteadOfInteger(System.out);
    
}
}