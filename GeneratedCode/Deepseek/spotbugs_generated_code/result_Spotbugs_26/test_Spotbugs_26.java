import org.junit.Test;
import static org.junit.Assert.*;

public class EnumTypeTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        assertFalse(EnumType.showBug());
    }
}