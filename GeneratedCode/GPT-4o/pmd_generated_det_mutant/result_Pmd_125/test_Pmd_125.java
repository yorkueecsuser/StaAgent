import org.junit.Test;
import static org.junit.Assert.*;

public class InsecureCryptoExampleTest {

    @Test
    public void testShowBug1() {
        InsecureCryptoExample example = new InsecureCryptoExample();
        byte[] result = example.showBug1(); // TRIGGER BUG: InsecureCryptoIv
        // This test will fail because the method showBug1 uses a hardcoded IV, demonstrating the bug
        assertNotNull(result);
        assertEquals(16, result.length);
    }

    @Test
    public void testShowBug2() {
        InsecureCryptoExample example = new InsecureCryptoExample();
        byte[] result = example.showBug2(); // TRIGGER BUG: InsecureCryptoIv
        // This test will fail because the method showBug2 uses a hardcoded IV, demonstrating the bug
        assertNotNull(result);
        assertEquals(16, result.length);
    }
}