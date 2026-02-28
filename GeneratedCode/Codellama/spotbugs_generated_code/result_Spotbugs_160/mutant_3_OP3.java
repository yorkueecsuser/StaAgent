import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
    }

    public static boolean getCondition() {
        return false;
    }

    public static void showBugWithUnreachableIfStatement(String name) {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Hello, " + name);
        } else {
            System.out.println("Goodbye, " + name);
        }
    }
}