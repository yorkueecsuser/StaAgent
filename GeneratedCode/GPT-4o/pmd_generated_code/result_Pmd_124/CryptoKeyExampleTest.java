import org.junit.Test;
import static org.junit.Assert.*;

public class CryptoKeyExampleTest {

    @Test
    public void testShowBug() {
        CryptoKeyExample example = new CryptoKeyExample();
        
        // This should trigger the bug because it uses a hardcoded cryptographic key
        byte[] result = example.showBug(); // TRIGGER BUG: HardCodedCryptoKey
        
        // Failing condition to trigger bug
        assertNotNull("The key should not be hardcoded and should be null to pass the test", null);
    }
}