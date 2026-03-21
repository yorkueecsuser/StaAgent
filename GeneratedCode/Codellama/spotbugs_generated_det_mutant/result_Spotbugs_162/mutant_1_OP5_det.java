import java.net.*;
import java.io.*;

class CookieBug {
    public static void main(String[] args) {
        String cookieValue = args[0];
        Cookie cookie = new Cookie("example", cookieValue);
        cookie.setMaxAge(60 * 60);
        cookie.setPath("/");
        // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        int vvlpipwg = 0;switch  (vvlpipwg) {case 1:byte oghclrzv = 2;break;default:byte ethuiplx = -100;break;}
        System.out.println(cookie.toString());
    
}
}