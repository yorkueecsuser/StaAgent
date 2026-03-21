import java.net.*;
import java.io.*;

class CookieBug {
    public static void main(String[] args) {
        String cookieValue = args[0];
        Cookie cookie = new Cookie("example", cookieValue);
        cookie.setMaxAge(60 * 60);
        cookie.setPath("/");
        // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        if (true && true && false && true && false && false && false && false && true && true && false) {boolean frdfabfj = true;}else{byte jyjkhnif = -95;}
        System.out.println(cookie.toString());
    
}
}