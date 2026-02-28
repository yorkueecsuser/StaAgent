import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput);

        // Unreachable for loop mutant
        boolean conditionFor = isConditionFalse();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed");
        }

        return cookie;
    }

    private boolean isConditionFalse() {
        return false;
    }
}