import java.io.PrintStream;

class PrintfArgsBug {

    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
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

    // Mutated code with renaming operator
    void x(stringInsteadOfInteger(PrintStream a) {
        a.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public String y() {
        StringBuilder b = new StringBuilder();
        x(new PrintStream(new java.io.ByteArrayOutputStream()) {
            @Override
            public void print(String c) {
                b.append(c);
            }
        });
        return b.toString();
    }
}