import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        if (false && false && true && false && false && true && false && true && true && false && false) {char fybkzjvw = 'w';}else{byte wshbskys = -76;}
        stringInsteadOfInteger(System.out);
    
}
}