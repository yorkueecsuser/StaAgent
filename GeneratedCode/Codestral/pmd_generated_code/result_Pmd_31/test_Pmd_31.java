import org.junit.Test;
import static org.junit.Assert.*;

public class JuniorClassTest {

    @Test
    public void testInitializeValue() {
        JuniorClass juniorClass = new JuniorClass();
        // TRIGGER BUG: ConstructorCallsOverridableMethod
        assertEquals("JUNIORCLASS", juniorClass.showBug());
    }
}