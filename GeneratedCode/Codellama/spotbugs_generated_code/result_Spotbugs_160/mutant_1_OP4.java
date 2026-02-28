import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        // mutant code begins
        boolean condition = false;
        if (condition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is reachable");
        }
        // mutant code ends
    }
}