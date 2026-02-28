import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        String unusedVariable = "deadStore"; // Mutant: Dead Store
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        return cookie;
    }
}