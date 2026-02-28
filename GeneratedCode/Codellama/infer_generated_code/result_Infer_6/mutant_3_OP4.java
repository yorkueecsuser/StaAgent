import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}

class PrintfArgsBugMutant1 {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
        if (false) {
            System.out.println("This is unreachable code");
        } else {
            System.out.println("This code is reachable");
        }
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}