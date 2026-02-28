import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput);
        // Mutated Code: Duplication of assignment statement
        HttpCookie duplicateCookie = new HttpCookie("buggyCookie", untrustedInput);
        return cookie;
    }
}