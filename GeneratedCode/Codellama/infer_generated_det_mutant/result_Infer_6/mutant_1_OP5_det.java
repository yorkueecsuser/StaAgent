import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        int tkfzpnxv = 0;switch  (tkfzpnxv) {case 1:long xlkphxjl = 893193869;break;default:short xhiirixv = 4509;break;}
        stringInsteadOfInteger(System.out);
    
}
}