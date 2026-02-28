import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}

// Mutation Operator: Unreachable for loop
// Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            break;
        }
    }

    public static void showBug() {
        stringInsteadOfInteger(System.out);
    }
}