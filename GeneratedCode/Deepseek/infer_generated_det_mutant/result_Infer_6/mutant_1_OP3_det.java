import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        if (true && true && false && true && false && false && true && true && false && false && false) {short lyxcsidi = -2962;}
        stringInsteadOfInteger(System.out);
    
}
}