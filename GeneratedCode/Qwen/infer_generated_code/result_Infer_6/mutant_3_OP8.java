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
    void a(PrintStream b) {
        b.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public String c() {
        StringBuilder d = new StringBuilder();
        a(new PrintStream(new java.io.ByteArrayOutputStream()) {
            @Override
            public void print(String e) {
                d.append(e);
            }
        });
        return d.toString();
    }
}