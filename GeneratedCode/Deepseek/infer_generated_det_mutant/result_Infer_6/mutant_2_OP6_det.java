import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        for  (int lftbpzob = 0; lftbpzob < 0; lftbpzob++) {int qphwxgca = -579026866;}
        stringInsteadOfInteger(System.out);
    
}
}