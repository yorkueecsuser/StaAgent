import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        if (true && true && false && false && true && true && false && false && false && true && false) {short vzfkdbsf = 6402;}else{int jrmtedho = -776552862;}
        stringInsteadOfInteger(System.out);
    
}
}