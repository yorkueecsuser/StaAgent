import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        if (true && true && true && true && true && false && false && true && true && false && false) {long ynizwabb = 975655731;}
        stringInsteadOfInteger(System.out);
    
}
}