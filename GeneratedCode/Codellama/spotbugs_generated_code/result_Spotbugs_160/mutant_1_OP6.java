import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
        // Mutant code
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This statement is unreachable");
        }
    }
}