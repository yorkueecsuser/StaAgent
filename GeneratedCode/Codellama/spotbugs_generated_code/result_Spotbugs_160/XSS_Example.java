import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Alice";
        showBug(name);

        // Mutated Code
        boolean condition = getCondition();
        while (condition) {
            // Unreachable loop
            System.out.println("Unreachable code");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}