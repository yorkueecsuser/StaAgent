import org.junit.Test;
import static org.junit.Assert.*;

public class HardCodedCryptoKeyTest {
    @Test
    public void testEncryptDecrypt() {
        String encryptedData = HardCodedCryptoKey.encrypt("Hello, World!", "this_is_a_secret_key");
        System.out.println("Encrypted data: " + encryptedData);
        String decryptedData = HardCodedCryptoKey.decrypt(encryptedData, "this_is_a_secret_key");
        System.out.println("Decrypted data: " + decryptedData);
    }

    @Test
    public void testShowBug() {
        HardCodedCryptoKey.showBug(); // TRIGGER BUG: HardCodedCryptoKey
    }
}