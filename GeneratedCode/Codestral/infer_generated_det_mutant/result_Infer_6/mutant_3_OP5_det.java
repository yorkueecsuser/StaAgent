import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        int rrlwlwwf = 0;switch  (rrlwlwwf) {case 1:float xcigxypo = -268808714;break;default:byte vkqolvdu = -27;break;}
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    
}

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}