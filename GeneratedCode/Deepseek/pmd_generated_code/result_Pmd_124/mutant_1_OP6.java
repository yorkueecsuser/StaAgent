import java.security.Key;
import java.util.Properties;
import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKey {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    public void showBug() {
        bad();
    }
    
    public void unreachableForLoop() {
        for(int i = 0; false; i++) {
            System.out.println("Unreachable code");
        }
    }
    
    public static void main(String[] args) {
        HardCodedCryptoKey hck = new HardCodedCryptoKey();
        hck.showBug();
        hck.unreachableForLoop();
    }
}