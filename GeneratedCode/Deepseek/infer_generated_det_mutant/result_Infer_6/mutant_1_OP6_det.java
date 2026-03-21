import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        for  (int igbfloth = 0; igbfloth < 0; igbfloth++) {short maphjiuy = 1981;}
        stringInsteadOfInteger(System.out);
    
}
}