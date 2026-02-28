import org.junit.Test;
import static org.junit.Assert.*;

public class JuniorClassTest {
    @Test
    // TRIGGER BUG: ConstructorCallsOverridableMethod
    public void testShowBug() {
        JuniorClass jc = new JuniorClass();
        assertNotNull(jc.toString()); // This will fail because toString() throws NullPointerException
    }
}