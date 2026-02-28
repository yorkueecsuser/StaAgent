import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Inserting a dead store with an unused variable
        int abcdefgh = 42; // Dead store: unused variable declaration

        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS
    }
}