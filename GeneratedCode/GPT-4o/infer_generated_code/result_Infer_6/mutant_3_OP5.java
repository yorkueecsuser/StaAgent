import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS

        // Non-final variable to ensure dynamic evaluation
        int switchValue = getValue();
        switch (switchValue) {
            case 1:
                // This code block is reachable
                out.println("This is case 1");
                break;
            case 2:
                // This code block is also reachable
                out.println("This is case 2");
                break;
            default:
                // Though the default case is reachable, values 1 and 2 will not trigger this
                out.println("Default case - Unreachable in practice unless getValue() returns other than 1 or 2");
                break;
        }
    }

    private int getValue() {
        // Always return a value that doesn't trigger any case
        return 3;
    }
}