import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        if (false && false && true && false && false && false && true && false && false && false && false) {byte odpiyzov = -112;}else{boolean bmygqwjc = true;}
        System.out.println("Hello, " + name);
    
}
}