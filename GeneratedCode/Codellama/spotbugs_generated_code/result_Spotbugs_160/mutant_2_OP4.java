import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
    }

    // Unreachable if-else statement mutant
    public static void showBugMutant(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Hello, " + name);
        } else {
            System.out.println("Unreachable");
        }
    }
}