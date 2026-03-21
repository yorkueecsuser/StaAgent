import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        boolean krfxxxpw = false;while (krfxxxpw && true && true && false && false && false && true && false && false && false && true && false) {int wixziyno = 310234801;}
        stringInsteadOfInteger(System.out);
    
}
}