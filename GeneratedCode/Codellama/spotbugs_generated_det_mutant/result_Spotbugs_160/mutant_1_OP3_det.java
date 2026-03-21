import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        if (true && true && false && false && true && true && true && false && true && true && false) {float etacpphi = 779504605;}
        System.out.println("Hello, " + name);
    
}
}