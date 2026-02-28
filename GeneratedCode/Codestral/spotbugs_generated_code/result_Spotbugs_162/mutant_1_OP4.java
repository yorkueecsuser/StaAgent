import java.net.HttpCookie;

class CookieBug {
    private boolean getCondition() {
        return false;
    }

    public HttpCookie showBug(String untrustedInput) {
        if (getCondition()) {
            /* Unreachable code block */
            HttpCookie tempCookie = new HttpCookie("tempCookie", "untrustedValue");
            // Perform some operations with tempCookie
        } else {
            // Original code
            HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput);
            return cookie;
        }
        return null;
    }
}