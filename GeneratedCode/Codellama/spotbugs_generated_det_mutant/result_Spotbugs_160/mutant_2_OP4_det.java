import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        if (false && true && true && false && false && false && true && false && true && true && false) {long zyocouvp = -566374377;}else{int gaffmiix = 691955059;}
        System.out.println("Hello, " + name);
    
}
}