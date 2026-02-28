import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);

        // Mutant 1: Unreachable if-else statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("This code is still reachable");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}