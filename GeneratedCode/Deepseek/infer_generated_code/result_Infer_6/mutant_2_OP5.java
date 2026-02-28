import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    void unreachableSwitchStatement() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This switch statement will never be reached because shouldRun is always true.
            // That's why we add an unreachable switch statement.
            // We can use a number that is not in the case statement conditions to ensure the switch is unreachable.
            switch (0) {
                case 1:
                    break;
                default:
                    break;
            }
        } else {
            // This switch statement will always be reached because shouldRun is always false.
            // That's why we do not add an unreachable switch statement.
            switch (1) {
                case 1:
                    break;
                default:
                    break;
            }
        }
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
        unreachableSwitchStatement();
    }

    private boolean getCondition() {
        return true;
    }
}