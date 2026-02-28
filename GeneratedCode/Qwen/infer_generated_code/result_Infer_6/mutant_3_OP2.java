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
                String temp = s;  // Original assignment
                String temp2 = s;  // Duplicated assignment
                result.append(temp);
                result.append(temp2);  // Using both to avoid unreachable statement error
            }
        });
        return result.toString();
    }
}