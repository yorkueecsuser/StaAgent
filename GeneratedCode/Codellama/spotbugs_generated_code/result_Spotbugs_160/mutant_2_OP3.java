import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
    }

    // Unreachable if statement mutation
    public static void showBugMutated(String name) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Hello, " + name);
        }
    }
}