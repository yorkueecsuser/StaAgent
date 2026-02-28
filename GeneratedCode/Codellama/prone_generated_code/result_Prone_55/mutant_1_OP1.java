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

// Dead Store Mutation Operator
// Insert unused variable declaration with one primitive type (for example string, int) to a randomly selected basic block in the program.
// The name of the variable is a string of eight characters randomly generated in the form of [a-z].
// Only one dead store is added in each transformation by this operator.

class FormatStringAnnotationBug_DeadStore {

    public static String myLogMessage(String fmt, Object... args) {
        String unusedVariable = "unusedString"; // Dead store mutant
        return new Formatter().format(fmt, args).toString();
    }

    public static void showBug() {
        String message = myLogMessage("My log message: %d and %d", 3, "has a message");
        System.out.println(message);
    }
}