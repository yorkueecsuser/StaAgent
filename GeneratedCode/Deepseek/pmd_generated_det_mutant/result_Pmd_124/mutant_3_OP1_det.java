import java.security.Key;
import java.util.Properties;
import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKey {

    void bad() {
        short bqtdwvfg = 6188;
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    
}

    public void showBug() {
        bad();
    }
    
    public static void main(String[] args) {
        HardCodedCryptoKey hck = new HardCodedCryptoKey();
        hck.showBug();
    }
}