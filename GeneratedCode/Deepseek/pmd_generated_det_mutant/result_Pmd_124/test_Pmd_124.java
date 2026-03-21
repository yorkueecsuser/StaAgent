import org.junit.Test;
import static org.junit.Assert.*;

public class HardCodedCryptoKeyTest {

    @Test
    public void testBadMethod() {
        HardCodedCryptoKey hck = new HardCodedCryptoKey();
        hck.showBug(); // TRIGGER BUG: HardCodedCryptoKey
    }
}