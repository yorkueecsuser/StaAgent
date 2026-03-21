import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        int cnwoxgmd = 0;switch  (cnwoxgmd) {case 1:int bqrntslu = 489502740;break;default:int pazryyzt = 518146670;break;}
        stringInsteadOfInteger(System.out);
    
}
}