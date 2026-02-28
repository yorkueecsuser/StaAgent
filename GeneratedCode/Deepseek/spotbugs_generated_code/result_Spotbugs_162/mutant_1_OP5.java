import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput);

        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // This case is unreachable
                System.out.println("Unreachable code");
                break;
        }

        return cookie;
    }

    private int getUnreachableValue() {
        // Always returns a value that is not 1
        return 2;
    }
}