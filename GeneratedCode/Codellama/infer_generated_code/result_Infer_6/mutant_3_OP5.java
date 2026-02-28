import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }

    // Unreachable switch statement mutant
    public static void stringInsteadOfIntegerMutant(PrintStream out) {
        out.printf("Hello %d", "world");
        switch (false) {
            case true:
                out.printf("Hello %d", "world");
                break;
            default:
                break;
        }
    }

    public static void showBugMutant() {
        stringInsteadOfIntegerMutant(System.out);
    }
}