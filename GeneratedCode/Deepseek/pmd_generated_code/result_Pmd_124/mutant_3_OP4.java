import java.security.Key;
import java.util.Properties;
import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKey {

    void bad() {
        boolean condition = false;
        if (condition) {
            SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES");
        } else {
            // Unreachable code
            SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES");
        }
    }

    public void showBug() {
        bad();
    }
    
    public static void main(String[] args) {
        HardCodedCryptoKey hck = new HardCodedCryptoKey();
        hck.showBug();
    }
}