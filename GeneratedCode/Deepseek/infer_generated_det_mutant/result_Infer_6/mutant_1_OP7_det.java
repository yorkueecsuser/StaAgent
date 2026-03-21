import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        boolean cnclcmss = false;while (cnclcmss && true && true && false && true && true && true && true && false && false && true && false) {byte ptihwptr = -25;}
        stringInsteadOfInteger(System.out);
    
}
}