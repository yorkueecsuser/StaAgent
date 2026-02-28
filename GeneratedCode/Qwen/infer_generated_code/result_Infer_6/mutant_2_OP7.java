import java.io.PrintStream;

class PrintfArgsBug {

    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is intended to be unreachable
            System.out.println("This is an unreachable loop");
        }
    }

    public String showBug() {
        StringBuilder result = new StringBuilder();
        stringInsteadOfInteger(new PrintStream(new java.io.ByteArrayOutputStream()) {
            @Override
            public void print(String s) {
                result.append(s);
            }
        });
        return result.toString();
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the loop is unreachable
    }
}