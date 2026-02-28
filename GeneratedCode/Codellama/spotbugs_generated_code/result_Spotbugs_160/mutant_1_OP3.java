import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
    }
    
    // Unreachable If Statement Mutant
    public static void showBugMutant(String name) {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Hello, " + name);
        } else {
            // Do nothing
        }
    }
    
    private static boolean getCondition() {
        return false;
    }
}