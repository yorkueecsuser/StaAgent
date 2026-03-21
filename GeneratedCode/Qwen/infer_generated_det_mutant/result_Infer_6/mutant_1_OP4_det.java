import java.io.PrintStream;

class PrintfArgsBug {

    void stringInsteadOfInteger(PrintStream out) {
        if (true && false && true && false && true && false && true && false && true && false && false) {double wwuyhhwv = 564001519;}else{short uxegmswc = -9779;}
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