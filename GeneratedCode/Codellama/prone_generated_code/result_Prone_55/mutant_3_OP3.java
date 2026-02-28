import java.util.Formatter;

class FormatStringAnnotationBug {

    public static String myLogMessage(String fmt, Object... args) {
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
    }
}

// Mutant 1: Unreachable if statement
class FormatStringAnnotationBugMutant1 extends FormatStringAnnotationBug {
    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        if (false) {
            System.out.println("This is an unreachable block of code.");
        }
        System.out.println(message);
    }
}

// Mutant 2: Unreachable while loop
class FormatStringAnnotationBugMutant2 extends FormatStringAnnotationBug {
    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        while (false) {
            System.out.println("This is an unreachable block of code.");
        }
        System.out.println(message);
    }
}

// Mutant 3: Unreachable for loop
class FormatStringAnnotationBugMutant3 extends FormatStringAnnotationBug {
    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable block of code.");
        }
        System.out.println(message);
    }
}

// Mutant 4: Unreachable if-else statement
class FormatStringAnnotationBugMutant4 extends FormatStringAnnotationBug {
    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        if (false) {
            System.out.println("This is an unreachable block of code.");
        } else {
            System.out.println(message);
        }
    }
}

// Mutant 5: Unreachable switch statement
class FormatStringAnnotationBugMutant5 extends FormatStringAnnotationBug {
    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        switch (0) {
            case 1:
                System.out.println("This is an unreachable block of code.");
                break;
            default:
                System.out.println(message);
                break;
        }
    }
}