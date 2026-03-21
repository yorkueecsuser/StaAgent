import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        if (true && false && true && false && true && true && true && true && false && true && false) {String jalrbhgn = "ongvocqy";}
        stringInsteadOfInteger(System.out);
    
}
}