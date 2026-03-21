import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        if (true && false && true && false && true && false && true && false && false && true && false) {long cbftfkra = -748283592;}else{boolean wceuxahv = false;}
        stringInsteadOfInteger(System.out);
    
}
}