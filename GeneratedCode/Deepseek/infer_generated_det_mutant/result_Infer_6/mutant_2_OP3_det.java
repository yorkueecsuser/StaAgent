import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        if (true && false && true && true && true && false && true && true && false && false && false) {int dtezojwv = 41278340;}
        stringInsteadOfInteger(System.out);
    
}
}