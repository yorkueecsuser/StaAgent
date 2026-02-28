import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // Original code
        HttpCookie duplicateCookie = new HttpCookie("duplicateBuggyCookie", untrustedInput); // Mutant code (duplicated assignment)
        return cookie;
    }
}