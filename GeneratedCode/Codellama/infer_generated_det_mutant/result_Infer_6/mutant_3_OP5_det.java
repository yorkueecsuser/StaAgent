import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        int hyigzvoa = 0;switch  (hyigzvoa) {case 1:byte zchjjtps = -58;break;default:double weogfcoa = 421325423;break;}
        stringInsteadOfInteger(System.out);
    
}
}