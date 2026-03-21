import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        if (true && false && true && false && false && false && false && false && true && false && false) {String ptlixrkg = "msgnprnj";}
        System.out.println("Hello, " + name);
    
}
}