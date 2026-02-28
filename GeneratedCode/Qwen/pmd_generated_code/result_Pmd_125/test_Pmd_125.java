import org.junit.Test;
import static org.junit.Assert.*;
import java.security.SecureRandom;

public class InsecureCryptoExampleTest {

    @Test
    public void testShowBugWithHardcodedIv() throws Exception {
        InsecureCryptoExample example = new InsecureCryptoExample();
        SecureRandom random = new SecureRandom();
        byte[] key = new byte[16];
        random.nextBytes(key);

        byte[] encryptedMessage = example.showBug(key); // TRIGGER BUG: InsecureCryptoIv
        assertNotNull(encryptedMessage);
    }
}