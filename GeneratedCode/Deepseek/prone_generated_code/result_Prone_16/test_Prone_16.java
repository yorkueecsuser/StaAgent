import org.junit.Test;
import static org.junit.Assert.*;

public class ChainingConstructorIgnoresParameterTest {
    @Test
    public void testConstructorIgnoresParameter() {
        ChainingConstructorIgnoresParameter c = new ChainingConstructorIgnoresParameter(true);
        assertNotNull(c.getTarget()); // TRIGGER BUG: ChainingConstructorIgnoresParameter
    }
}