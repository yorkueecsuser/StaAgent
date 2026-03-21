import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        for  (int blzjmnzk = 0; blzjmnzk < 0; blzjmnzk++) {int rnwpevty = 656203397;}
        System.out.println("Hello, " + name);
    
}
}