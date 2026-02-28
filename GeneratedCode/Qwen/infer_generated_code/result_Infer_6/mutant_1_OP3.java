import java.io.PrintStream;

class PrintfArgsBug {

    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS

        // Inserting unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            out.println("This is an unreachable statement");
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
        return false; // This method always returns false, ensuring the if block is unreachable
    }
}