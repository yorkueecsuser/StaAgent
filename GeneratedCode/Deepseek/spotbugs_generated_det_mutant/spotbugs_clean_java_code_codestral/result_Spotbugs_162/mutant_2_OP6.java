import java.net.HttpCookie;

class CookieBug {
    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // Original Bug: HTTP cookie formed from untrusted input

        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This line will never be executed");
        }

        return cookie;
    }
}