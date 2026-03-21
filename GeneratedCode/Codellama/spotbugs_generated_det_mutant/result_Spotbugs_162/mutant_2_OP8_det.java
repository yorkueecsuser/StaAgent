import java.net.*;
import java.io.*;

class CookieBug {
    public static void main(String[] args) {
        String vjxzzkoy = args[0];
        Cookie cookie = new Cookie("example", vjxzzkoy);
        cookie.setMaxAge(60 * 60);
        cookie.setPath("/");
        // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        System.out.println(cookie.toString());
    }
}