import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput);

        // Mutated code: Renaming user-defined variables
        String mutatedVariable = "MutatedName";
        HttpCookie mutatedCookie = new HttpCookie("mutatedCookie", mutatedVariable);

        return cookie;
    }
}