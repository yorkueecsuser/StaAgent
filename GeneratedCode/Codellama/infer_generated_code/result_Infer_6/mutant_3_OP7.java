import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }

    public static void unreachableWhileLoop(PrintStream out) {
        out.printf("Hello %d", "world");
        while(false) {
            /* code */
        }
    }
}