import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        int ngtvpkkq = 0;switch  (ngtvpkkq) {case 1:long ujepqjkp = 546190118;break;default:char poizzpfw = 'g';break;}
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        return cookie;
    
}
}