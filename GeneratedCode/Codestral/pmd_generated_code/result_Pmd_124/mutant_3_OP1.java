import javax.crypto.spec.SecretKeySpec;
import java.util.Random;

class HardCodedCryptoKeyBug {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        String deadStore = generateRandomString(8); // MUTATION: Dead Store
    }

    public SecretKeySpec showBug() {
        bad();
        String deadStore = generateRandomString(8); // MUTATION: Dead Store
        return new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
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