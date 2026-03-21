import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        int xkaiouqy = 0;switch  (xkaiouqy) {case 1:long rjbjyfsm = 214126246;break;default:short vatnxztr = 2376;break;}
        System.out.println("Hello, " + name);
    
}
}