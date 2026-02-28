import java.io.PrintStream;

class PrintfMismatch {
    public boolean getFalseCondition() {
        return false;
    }

    public void unreachableSwitchStatement(PrintStream out) {
        int value = 0; // This value is always 0, making the switch statement unreachable
        switch (value) {
            case 1:
                out.println("Unreachable code executed");
                break;
        }
    }

    public void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug(PrintStream out) {
        stringInsteadOfInteger(out);
        if (getFalseCondition()) {  // Using a dynamically determined condition
            unreachableSwitchStatement(out);  // Inserting unreachable switch statement
        }
    }
}