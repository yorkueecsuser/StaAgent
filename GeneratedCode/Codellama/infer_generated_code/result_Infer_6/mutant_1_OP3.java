import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }

    public static void main(String[] args) {
        if (false) {
            stringInsteadOfInteger(System.out);
        } else {
            showBug();
        }
    }
}