import java.net.HttpCookie;

class CookieBug {
    private boolean getFalseCondition() {
        return false;
    }

    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput);

        // Adding unreachable switch statement
        int unreachableValue = 1;
        boolean condition = getFalseCondition();
        if (condition) {
            switch (unreachableValue) {
                case 1:
                    System.out.println("This line will never be executed.");
                    break;
            }
        }

        return cookie;
    }
}