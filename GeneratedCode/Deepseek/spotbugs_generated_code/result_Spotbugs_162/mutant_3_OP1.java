import java.net.HttpCookie;
import java.util.Random;

class CookieBug {
    public HttpCookie showBug(String untrustedInput) {
        HttpCookie cookie = new HttpCookie("buggyCookie", untrustedInput); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        String deadStore = generateRandomString(8); // Dead Store
        return cookie;
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }
}