import java.net.*;
import java.io.*;

class CookieBug {
    public static void main(String[] args) {
        String cookieValue = args[0];
        Cookie cookie = new Cookie("example", cookieValue);
        cookie.setMaxAge(60 * 60);
        cookie.setPath("/");
        // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        int mzshowqo = 0;switch  (mzshowqo) {case 1:double vrhzpydh = 166659252;break;default:short fephrmhv = 8426;break;}
        System.out.println(cookie.toString());
    
}
}