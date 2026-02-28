import java.io.PrintStream;

class PrintfArgsBug {

    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile will always be false
            out.println("This is an unreachable loop");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the while loop unreachable
        return false;
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
}