import java.security.Key;
import java.util.Properties;
import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKey {

    void bad() {
        String secretKey = "my secret here";
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    public void showBug() {
        bad();
    }
    
    public static void main(String[] args) {
        HardCodedCryptoKey hck = new HardCodedCryptoKey();
        hck.showBug();
    }
}