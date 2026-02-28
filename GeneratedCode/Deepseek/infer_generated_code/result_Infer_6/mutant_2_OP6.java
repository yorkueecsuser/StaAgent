import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
        // Add a loop with a false condition to make it unreachable
        for(boolean condition = false; condition == true; ){
            // Do nothing but keep the loop unreachable 
        }
    }

    public void showBug() {
        stringInsteadOfInteger(System.out);
    }
}