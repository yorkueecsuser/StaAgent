import java.security.Key;
import java.util.Properties;
import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKey {

    void bad() {
        String unused = "unused"; // Mutation Operator: Dead Store
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); 
    }

    public void showBug() {
        bad();
    }
    
    public static void main(String[] args) {
        HardCodedCryptoKey hck = new HardCodedCryptoKey();
        hck.showBug();
    }
}