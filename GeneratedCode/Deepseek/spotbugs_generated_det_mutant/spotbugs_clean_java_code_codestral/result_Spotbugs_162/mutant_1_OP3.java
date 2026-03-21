import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        if (getUnreachableCondition()) { // Mutant: Unreachable if statement
            throw new RuntimeException("This code is unreachable");
        }
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        return cookie;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}