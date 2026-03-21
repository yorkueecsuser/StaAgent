import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        int pycgwxpb = 0;switch  (pycgwxpb) {case 1:long lqcjsrcy = -746419345;break;default:long kzfeihtx = -648115808;break;}
        stringInsteadOfInteger(System.out);
    
}
}