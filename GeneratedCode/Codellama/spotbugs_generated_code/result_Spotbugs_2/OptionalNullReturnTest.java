import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalNullReturnTest {
    @Test
    public void testGetOptional() {
        Optional<String> optional = OptionalNullReturn.getOptional();
        // TRIGGER BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        assertNull(optional);
    }

    @Test
    public void testShowBug() {
        OptionalNullReturn.showBug();
        // TRIGGER BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        assertEquals("Default value", OptionalNullReturn.getOptional().orElse("Default value"));
    }
}