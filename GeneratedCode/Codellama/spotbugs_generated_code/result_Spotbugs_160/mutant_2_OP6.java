import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
    }

    // Unreachable for loop mutation
    public static void unreachableForLoop(String name) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Hello, " + name);
        }
    }

    private static boolean getCondition() {
        return false;
    }
}