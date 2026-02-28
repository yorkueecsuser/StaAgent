import org.junit.Test;
import static org.junit.Assert.*;

public class EnumEqualsBugDemoTest {

    @Test
    public void testShowBug() {
        EnumEqualsBugDemo.Color color1 = EnumEqualsBugDemo.Color.RED;
        EnumEqualsBugDemo.Color color2 = EnumEqualsBugDemo.Color.GREEN;

        // TRIGGER BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        assertTrue(EnumEqualsBugDemo.showBug(color1, color2));

        // TRIGGER BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        assertFalse(color1 == color2);
    }
}