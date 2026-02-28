import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }

    public static void main(String[] args) {
        stringInsteadOfInteger(System.out);
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable");
        }
    }
}