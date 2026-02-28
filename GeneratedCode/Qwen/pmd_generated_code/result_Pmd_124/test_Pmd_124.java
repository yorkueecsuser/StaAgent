import org.junit.Test;
import static org.junit.Assert.*;

public class CryptoExampleTest {

    @Test
    public void testShowBug() throws Exception {
        CryptoExample cryptoExample = new CryptoExample();
        String result = cryptoExample.showBug("testInput"); // TRIGGER BUG: HardCodedCryptoKey
        assertNotNull(result); // This assertion will pass, but the bug is triggered in the line above
    }
}