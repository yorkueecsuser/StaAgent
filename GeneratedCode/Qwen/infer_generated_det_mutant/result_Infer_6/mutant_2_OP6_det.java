import java.io.PrintStream;

class PrintfArgsBug {

    void stringInsteadOfInteger(PrintStream out) {
        for  (int lkdpefgs = 0; lkdpefgs < 0; lkdpefgs++) {float tycqzhsi = -34153706;}
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