import java.security.Key;
import java.util.Properties;
import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKey {

    void bad() {
        SecretKeySpec secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES"); // BUG: HardCodedCryptoKey
    }

    void renamedBad() {
        SecretKeySpec secretKeySpec2 = new SecretKeySpec("my secret here".getBytes(), "AES"); // Mutation: Renaming
    }

    public void showBug() {
        bad();
    }

    public void showRenamedBug() {
        renamedBad();
    }

    public static void main(String[] args) {
        HardCodedCryptoKey hck = new HardCodedCryptoKey();
        hck.showBug();
        hck.showRenamedBug();
    }
}