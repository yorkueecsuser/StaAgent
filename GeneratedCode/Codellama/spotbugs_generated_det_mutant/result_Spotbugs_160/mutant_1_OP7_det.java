import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        boolean tprtlppf = false;while (tprtlppf && true && false && true && false && true && true && true && true && true && false && false) {short cfvcjapw = 7680;}
        System.out.println("Hello, " + name);
    
}
}