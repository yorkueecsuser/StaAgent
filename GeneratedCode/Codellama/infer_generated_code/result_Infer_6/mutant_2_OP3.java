import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}

// Mutant 1: Unreachable if statement
class PrintfArgsBugMutant1 {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
        if (false) {
            out.printf("Hello %s", "world");
        }
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}

// Mutant 2: Unreachable while loop
class PrintfArgsBugMutant2 {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
        while (false) {
            out.printf("Hello %s", "world");
        }
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}

// Mutant 3: Unreachable for loop
class PrintfArgsBugMutant3 {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
        for (int i = 0; false; i++) {
            out.printf("Hello %s", "world");
        }
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}

// Mutant 4: Unreachable if-else statement
class PrintfArgsBugMutant4 {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
        if (false) {
            out.printf("Hello %s", "world");
        } else {
            out.printf("Hello %d", "world");
        }
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}

// Mutant 5: Unreachable switch statement
class PrintfArgsBugMutant5 {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
        switch (0) {
            case 1:
                out.printf("Hello %s", "world");
                break;
            default:
                out.printf("Hello %d", "world");
                break;
        }
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}