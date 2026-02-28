import java.net.HttpCookie;

class CookieBug {
    private boolean getCondition() {
        return false;
    }

    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)

        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Mutant code: Unreachable while loop
            System.out.println("This line should never be executed.");
        }

        return cookie;
    }
}