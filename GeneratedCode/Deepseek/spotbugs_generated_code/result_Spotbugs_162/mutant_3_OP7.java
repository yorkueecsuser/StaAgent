import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // Original bug

        boolean unreachableCondition = false;
        while (unreachableCondition) { // Mutated code: Unreachable while loop
            System.out.println("This line will never be executed.");
        }

        return cookie;
    }

    // Method to return the condition for the while loop
    private boolean getCondition() {
        return false;
    }
}