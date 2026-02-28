import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class InsecureCryptoIvTest {

    @Test
    public void testShowBug() {
        InsecureCryptoIv insecureCryptoIv = new InsecureCryptoIv();
        byte[] result = insecureCryptoIv.showBug();
        byte[] hardCodedIv = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00 };
        assertTrue("The IV should not be hard coded", Arrays.equals(result, hardCodedIv)); // TRIGGER BUG: InsecureCryptoIv
    }
}