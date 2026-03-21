import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        if (false && true && false && false && true && false && false && false && false && false && false) {boolean vkgrbsul = false;}
        stringInsteadOfInteger(System.out);
    
}
}