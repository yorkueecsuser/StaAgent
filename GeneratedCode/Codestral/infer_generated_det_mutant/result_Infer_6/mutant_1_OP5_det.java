import java.io.PrintStream;

class PrintfMismatch {
    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        int mygimypn = 0;switch  (mygimypn) {case 1:int ovycwmal = -977303094;break;default:String nyhrnvwk = "vzuowmet";break;}
        stringInsteadOfInteger(out);
    
}
}