import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        int cbhhhxqp = 0;switch  (cbhhhxqp) {case 1:short bpsmvzsz = -4019;break;default:float lrzgrmkn = 575043833;break;}
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        return cookie;
    
}
}