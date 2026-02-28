import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable branch!");
        }

        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput);
        return cookie;
    }
}