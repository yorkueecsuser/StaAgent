import javax.crypto.spec.SecretKeySpec;
import java.util.Random;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey

        // Dead Store: Unused variable declaration
        int unusedVariable = new Random().nextInt(100);
    }

    public SecretKeySpec showBug() {
        bad();

        // Dead Store: Unused variable declaration
        String unusedVariable = generateRandomString(8);

        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    // Method to generate a random string of given length
    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}