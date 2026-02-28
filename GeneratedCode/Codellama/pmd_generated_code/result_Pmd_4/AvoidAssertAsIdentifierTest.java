import org.junit.Test;
import static org.junit.Assert.*;

class AvoidAssertAsIdentifierTest {
    @Test
    public void testBug() {
        AvoidAssertAsIdentifier testInstance = new AvoidAssertAsIdentifier();
        int result = testInstance.showBug();
        assertEquals(10, result); // TRIGGER BUG: AvoidAssertAsIdentifier
    }
}