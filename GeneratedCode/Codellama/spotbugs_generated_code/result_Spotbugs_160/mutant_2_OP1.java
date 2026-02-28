import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        String randomVar = "abcdefg"; // Dead Store
        System.out.println("Hello, " + name);
    }
}