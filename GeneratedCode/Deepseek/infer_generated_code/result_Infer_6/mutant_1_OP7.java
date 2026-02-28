import java.io.PrintStream;

class PrintfArgsBug {
    boolean condition = true;  // Mutant code

    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        while (condition == false) {  // Mutant code
            System.out.println("This line is unreachable.");
        }
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }
}