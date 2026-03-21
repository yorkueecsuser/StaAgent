import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        int zcqizasa = 0;switch  (zcqizasa) {case 1:double zlhrqcex = 51830585;break;default:char lsvzqfeg = 'b';break;}
        System.out.println("Hello, " + name);
    
}
}