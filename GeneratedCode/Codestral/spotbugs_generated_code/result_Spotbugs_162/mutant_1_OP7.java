import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput);

        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This is an unreachable loop");
        }

        return cookie;
    }
}