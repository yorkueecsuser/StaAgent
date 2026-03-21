import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        int eoswfqzm = 0;switch  (eoswfqzm) {case 1:float uryfbuow = -863764220;break;default:double uonlvowc = -234667629;break;}
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    
}

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}