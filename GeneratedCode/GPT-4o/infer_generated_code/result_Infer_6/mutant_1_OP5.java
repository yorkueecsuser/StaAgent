import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS

        // Adding unreachable switch statement using a non-final variable
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                out.println("This is unreachable");
                break;
            default:
                out.println("Default case");
        }
    }

    private int getUnreachableValue() {
        return 999; // Ensures 'unreachableValue' never matches case 1
    }
}