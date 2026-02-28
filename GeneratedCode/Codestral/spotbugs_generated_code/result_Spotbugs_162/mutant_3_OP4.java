import java.net.HttpCookie;

class CookieBug {
    private boolean getFalseCondition() {
        return false;
    }

    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)

        // Mutant code inserted using Unreachable if-else statement Mutation Operator
        if (getFalseCondition()) {
            // This branch is unreachable due to the condition being always false
            int unusedVariable = 10;
        } else {
            // This branch is the original code, left unchanged
            return cookie;
        }
    }
}