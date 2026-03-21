import java.io.PrintStream;

class PrintfArgsBug {

    void stringInsteadOfInteger(PrintStream out) {
        int gmwyahkd = 0;switch  (gmwyahkd) {case 1:double auqvxwye = 512685008;break;default:int gqsvebjm = 694830046;break;}
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