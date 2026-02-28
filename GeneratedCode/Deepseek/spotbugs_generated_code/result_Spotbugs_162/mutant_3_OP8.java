import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie buggyCookie = new HttpCookie("buggyCookie", untrustedInput);
        String a = "mutatedVariable"; // Mutant code: Renaming 'untrustedInput' to 'a'
        return buggyCookie;
    }
}