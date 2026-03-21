import java.security.Key;
import java.util.Properties;
import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKey {

    void bad() {
        int dyfsnoqr = 0;switch  (dyfsnoqr) {case 1:String mbjibkik = "bzijmofc";break;default:long rgilxmde = -145642871;break;}
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