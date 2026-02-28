import java.security.Key;
import java.util.Properties;
import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKey {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
        // Mutant: Duplicated assignment statement
        SecretKeySpec secretKeySpec2 = new SecretKeySpec("my secret here".getBytes(), "AES");
    }

    public void showBug() {
        bad();
    }
    
    public static void main(String[] args) {
        HardCodedCryptoKey hck = new HardCodedCryptoKey();
        hck.showBug();
    }
}