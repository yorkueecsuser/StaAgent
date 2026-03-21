import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        for  (int nokoorke = 0; nokoorke < 0; nokoorke++) {char egzqwzvk = 'e';}
        System.out.println("Hello, " + name);
    
}
}