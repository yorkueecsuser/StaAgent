import java.security.Key;
import java.util.Properties;
import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKey {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    public void showBug() {
        bad();
        if (false) {
            SecretKeySpec secretKeySpec = new SecretKeySpec("unused secret key".getBytes(), "AES");
        }
    }

    public static void main(String[] args) {
        HardCodedCryptoKey hck = new HardCodedCryptoKey();
        hck.showBug();
    }
}