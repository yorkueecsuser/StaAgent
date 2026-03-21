import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        int kkocwfbj = 0;switch  (kkocwfbj) {case 1:float cwbjkxdy = -843957592;break;default:float xxoohqwr = -829976542;break;}
        stringInsteadOfInteger(System.out);
    
}
}