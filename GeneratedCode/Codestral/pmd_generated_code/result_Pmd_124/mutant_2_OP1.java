import javax.crypto.spec.SecretKeySpec;
import java.util.Random;

class HardCodedCryptoKeyBug {

    void bad() {
        String randomVar = "unused variable"; // Dead store mutant
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    public SecretKeySpec showBug() {
        bad();
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    // Utility method to generate a random string of eight characters
    private static String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
         .limit(targetStringLength)
         .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
         .toString();
    }
}