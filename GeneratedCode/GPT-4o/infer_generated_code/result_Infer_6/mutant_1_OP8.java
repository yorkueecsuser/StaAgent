import java.io.PrintStream;

class PrintfArgMismatch {

    public static void main(String[] args) {
        PrintfArgMismatch example = new PrintfArgMismatch();
        example.showBug(System.out);
        
        // Mutant code
        PrintfArgMismatch b = new PrintfArgMismatch();
        b.showBug(System.out);
    }

    public void showBug(PrintStream out) {
        // Incorrect usage of printf with mismatched argument types
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS
        
        // Mutant code
        out.printf("Hello %d", "world"); // BUG: CHECKERS_PRINTF_ARGS
    }
}