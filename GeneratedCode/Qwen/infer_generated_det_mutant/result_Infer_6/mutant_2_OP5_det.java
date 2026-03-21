import java.io.PrintStream;

class PrintfArgsBug {

    void stringInsteadOfInteger(PrintStream out) {
        int dppxfjae = 0;switch  (dppxfjae) {case 1:float xzvoqgpr = -867414880;break;default:short fdgxiynk = 5804;break;}
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