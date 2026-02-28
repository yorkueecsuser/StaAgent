import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // Original bug remains

        // Mutated code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable loop iteration: " + i);
        }

        return cookie;
    }

    private boolean getCondition() {
        return false; // The loop condition is always false to make it unreachable
    }
}