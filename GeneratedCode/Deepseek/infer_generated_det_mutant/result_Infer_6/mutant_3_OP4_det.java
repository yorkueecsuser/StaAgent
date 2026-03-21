import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        if (false && false && false && false && true && false && true && false && false && true && false) {int bhfwpluo = 650110306;}else{double xmalivav = 975333461;}
        stringInsteadOfInteger(System.out);
    
}
}