import org.junit.Test;
import static org.junit.Assert.*;
import javax.crypto.spec.SecretKeySpec;

public class HardCodedCryptoKeyBugTest {

    @Test
    public void testShowBug() {
        HardCodedCryptoKeyBug bugInstance = new HardCodedCryptoKeyBug(); // Initializing the class
        SecretKeySpec keySpec = bugInstance.showBug(); // Calling the showBug() method
        assertNotEquals("my secret here".getBytes(), keySpec.getEncoded()); // TRIGGER BUG: HardCodedCryptoKey
    }
}