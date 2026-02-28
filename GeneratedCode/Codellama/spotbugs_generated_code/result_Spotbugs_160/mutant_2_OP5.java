import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
    }

    // Mutant code added after the existing code
    public static void showBugMutant(String name) {
        boolean shouldRun = false;
        switch (0) {
            case 1:
                shouldRun = true;
                break;
        }
        if (shouldRun) {
            System.out.println("Hello, " + name);
        }
    }
}