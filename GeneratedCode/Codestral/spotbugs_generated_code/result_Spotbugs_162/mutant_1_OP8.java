import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String input) { // Mutation: Renamed variable untrustedInput to input
        HttpCookie cookie = new HttpCookie("buggyCookie", input); // Original bug is still present
        return cookie;
    }
}