import java.net.HttpCookie;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput);

        // Inserted unreachable if statement
        boolean isUnreachable = false; // This condition is always false
        if (isUnreachable) {
            System.out.println("This statement will never be executed");
        }

        return cookie;
    }
}