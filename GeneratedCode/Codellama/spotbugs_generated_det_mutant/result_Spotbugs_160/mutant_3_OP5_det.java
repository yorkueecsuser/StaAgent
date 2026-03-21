import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        int fggxlhku = 0;switch  (fggxlhku) {case 1:boolean wmilpdmk = true;break;default:byte bfrqlazf = -84;break;}
        System.out.println("Hello, " + name);
    
}
}