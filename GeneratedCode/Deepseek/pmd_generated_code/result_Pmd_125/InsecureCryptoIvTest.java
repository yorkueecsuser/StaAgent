import org.junit.Test;
import static org.junit.Assert.*;

public class InsecureCryptoIvTest {
    
    @Test
    public void testGood() {
        InsecureCryptoIv obj = new InsecureCryptoIv();
        obj.good(); // TRIGGER BUG: InsecureCryptoIv
    }

    @Test
    public void testBad() {
        InsecureCryptoIv obj = new InsecureCryptoIv();
        obj.bad(); // TRIGGER BUG: InsecureCryptoIv
    }

    @Test
    public void testAlsoBad() {
        InsecureCryptoIv obj = new InsecureCryptoIv();
        obj.alsoBad(); // TRIGGER BUG: InsecureCryptoIv
    }
}