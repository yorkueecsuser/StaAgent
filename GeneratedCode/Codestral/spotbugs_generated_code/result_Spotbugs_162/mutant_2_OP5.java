import java.net.HttpCookie;

class CookieBug {
    private int getUnreachableValue() {
        return -1;
    }

    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)

        switch (getUnreachableValue()) {
            case 1:
                System.out.println("This code will never be executed");
                break;
            case 2:
                System.out.println("This code will also never be executed");
                break;
            // Add more cases if needed
        }

        return cookie;
    }
}