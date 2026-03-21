import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        if (true && true && true && false && true && true && false && true && false && false && false) {char swbcpgvc = 'p';}else{double kxkylkgz = -669130432;}
        System.out.println("Hello, " + name);
    
}
}