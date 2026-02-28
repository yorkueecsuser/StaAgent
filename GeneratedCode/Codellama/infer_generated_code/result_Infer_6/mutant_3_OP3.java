import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        boolean condition = getCondition();
        if (condition) {
            out.printf("Hello %d", "world");
        } else {
            out.printf("Hello %d", 123);
        }
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}