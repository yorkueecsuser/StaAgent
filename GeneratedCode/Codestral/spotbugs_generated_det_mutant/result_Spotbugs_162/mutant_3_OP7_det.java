import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        boolean ubrxonum = false;while (ubrxonum && false && true && true && true && false && false && true && true && false && true && false) {double sdquvdti = 146160262;}
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        return cookie;
    
}
}