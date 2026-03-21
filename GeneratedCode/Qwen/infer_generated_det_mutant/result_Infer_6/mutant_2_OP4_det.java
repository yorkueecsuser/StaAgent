import java.io.PrintStream;

class PrintfArgsBug {

    void stringInsteadOfInteger(PrintStream out) {
        if (true && true && true && true && false && false && false && false && true && true && false) {float hwlfvltr = -167430041;}else{long fquomjkz = -698761270;}
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
}