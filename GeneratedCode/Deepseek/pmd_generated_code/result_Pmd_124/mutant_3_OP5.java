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

    public static void main(String[] args) {
        HardCodedCryptoKey hck = new HardCodedCryptoKey();
        hck.showBug();

        // Unreachable switch statement added
        int value = getValue();
        switch(value) {
            case 1:
                break;
            default:
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}