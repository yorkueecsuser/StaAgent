import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        for  (int oczcinke = 0; oczcinke < 0; oczcinke++) {double vyhbckjj = 108284746;}
        stringInsteadOfInteger(System.out);
    
}
}