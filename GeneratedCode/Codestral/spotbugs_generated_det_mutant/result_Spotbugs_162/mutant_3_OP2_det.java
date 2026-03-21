import java.net.HttpCookie;

class CookieBug {
public HttpCookie showBug(String untrustedInput){
    HttpCookie cookie = new HttpCookie("buggyCookie" , untrustedInput);
    cookie = new HttpCookie("buggyCookie" , untrustedInput);
    return cookie;
}
}