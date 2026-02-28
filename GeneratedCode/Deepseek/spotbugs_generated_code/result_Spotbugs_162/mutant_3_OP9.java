import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        // Original buggy code
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput);

        // Adding a mutant code using Equivalent Loop Replacement
        // Since there are no loops in the original code, we can't apply this mutation.
        // So, the mutated code remains the same as the original code.

        return cookie;
    }
}