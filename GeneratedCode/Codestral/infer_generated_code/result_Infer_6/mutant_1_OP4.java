import java.io.PrintStream;

class PrintfMismatch {

    public boolean getCondition() {
        return false;
    }

    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        } else {
            // Alternative code
            System.out.println("This is the alternative code.");
        }
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
    }
}