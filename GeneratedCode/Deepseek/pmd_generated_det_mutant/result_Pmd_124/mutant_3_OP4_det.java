import java.security.Key;
import java.util.Properties;
import javax.crypto.spec.SecretKeySpec;

class HardCodedCryptoKey {

    void bad() {
        if (false && false && true && true && true && true && false && true && true && false && false) {int asxwjqfv = 40133233;}else{char cjfhljsw = 'x';}
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